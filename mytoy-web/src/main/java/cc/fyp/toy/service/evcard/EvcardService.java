package cc.fyp.toy.service.evcard;

import cc.fyp.toy.controller.EvcardController;
import cc.fyp.toy.service.evcard.dto.EvcardOrderResp;
import cc.fyp.toy.service.evcard.dto.Evcards;
import cc.fyp.toy.service.evcard.dto.QueryDTO;
import cc.fyp.toy.service.evcard.outapi.EvcardApi;
import cc.fyp.toy.service.mesg.DingTalkMesg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EvcardService{

    private final static Logger logger = LoggerFactory.getLogger(EvcardController.class);

    @Autowired
    private TaskExecutor taskExecutor;

    public static final List<QueryDTO> QUERYS = new ArrayList<>();

    public void loadCard(QueryDTO option){
        QUERYS.add(option);
        EvcardQueryJob evcardQueryJob = new EvcardQueryJob();
        evcardQueryJob.setQueryDTO(option);
        taskExecutor.execute(evcardQueryJob);
    }


    /**
     * 从某个停车点获取符合条件的车辆
     * @param option
     * @return
     */
    public  Boolean exe(QueryDTO option){
        EvcardApi evcardApi = new EvcardApi();
        List<Evcards> list = evcardApi.queryCard(option);
        StringBuffer sb = new StringBuffer();
        sb.append("@李斯-银鹏");
        sb.append("\n");
        sb.append("查询到了符合的车辆");
        sb.append("\n");
        sb.append("=================");

        List<Evcards> canUseList = new ArrayList<>();
        for (Evcards evcard : list) {
            Integer cardType = EvcardApi.smallList.contains(evcard.getVehicleModelName()) ? 0 : 1;
            Integer soc = Integer.valueOf(evcard.getDrivingRange());
            if (option.getCarType().equals(cardType) && soc >= option.getOil()){
                canUseList.add(evcard);
                logger.info("查询到符合的结果：{}",evcard);
            }
        }

        if (canUseList.size()==0){
            return false;
        }
        this.sortCardList(canUseList,sb);
        DingTalkMesg.callMe(sb.toString());
        QUERYS.remove(option);
        return  true;
    }


    private  void sortCardList(List<Evcards> canUseList,StringBuffer sb){
        canUseList = canUseList.stream()
                .sorted((o,n) -> n.getDrivingRange().compareTo(o.getDrivingRange())).collect(Collectors.toList());

        canUseList.forEach(evcard -> {
            sb.append("\n");
            sb.append("车辆名称："+evcard.getVehicleModelName());
            sb.append("\n");
            sb.append("车牌号：" + evcard.getVehicleNo());
            sb.append("\n");
            sb.append("可行驶距离："+evcard.getDrivingRange());
            sb.append("\n");
            sb.append("vin："+evcard.getVin());
            sb.append("\n");
            sb.append("位置："+evcard.getShopName());
            sb.append("\n");
            sb.append("点击链接，即可预约：\n"+"http://test.callback.mogoroom.com/30_74_8090/mytoy/card/order?seq="+evcard.getShopSeq()+"&vin="+evcard.getVin());
            sb.append("\n");
            sb.append("=================");
        });
        System.out.println(canUseList);
    }

    public EvcardOrderResp order(String seq,String vin){
        EvcardApi evcardApi = new EvcardApi();
        EvcardOrderResp resp =  evcardApi.order(seq,vin);
        return resp;
    }

}
