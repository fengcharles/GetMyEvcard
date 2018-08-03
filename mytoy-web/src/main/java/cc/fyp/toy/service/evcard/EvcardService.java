package cc.fyp.toy.service.evcard;

import cc.fyp.toy.controller.EvcardController;
import cc.fyp.toy.service.evcard.dto.Evcards;
import cc.fyp.toy.service.evcard.dto.QueryDTO;
import cc.fyp.toy.service.mesg.DingTalkMesg;
import cc.fyp.toy.util.HttpClientUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EvcardService{

    private final static Logger logger = LoggerFactory.getLogger(EvcardController.class);

    private static final String GETCARD_URL = "https://mas.evcard.vip:8443/evcard-mas/evcardapp?service=getVehicleInfoList";

    private static final List<String> smallList = new ArrayList<>();

    public static final List<QueryDTO> QUERYS = new ArrayList<>();

    static {
        smallList.add("奇瑞EQ");
        smallList.add("荣威E50");
    }

    public void loadCard(QueryDTO option){
        doTask(option);
    }

    public void doTask(QueryDTO option){
        new Thread(()->{
            while (true){
                Boolean flag = exe(option);
                if (flag == true){
                    break;
                }
                try {
                    Thread.sleep(option.getQuerySeq());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        QUERYS.add(option);
    }

    public  Boolean  exe(QueryDTO option){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("canRent",1);
        jsonObject.put("shopSeq",option.getOption());
        jsonObject.put("token","9bedfbf3-b785-4036-8936-835ab1441da7");
        jsonObject.put("vehicleModelSeq","");

        String result = HttpClientUtil.postJson(GETCARD_URL,jsonObject.toString());
        JSONObject json =  JSONObject.parseObject(result);
        JSONArray jsonArray = json.getJSONArray("dataList");
        logger.info("原始请求结果：{}",json);
        List<Evcards> list = JSONArray.parseArray(jsonArray.toJSONString(), Evcards.class);
        for (Evcards evcard : list) {

            Integer cardType =  smallList.contains(evcard.getVehicleModelName()) ? 0 : 1;
            Integer soc = Integer.valueOf(evcard.getDrivingRange());
            if (option.getCarType().equals(cardType) && soc >= option.getOil()){
                logger.info("查询到符合的结果：{}",evcard);
                StringBuffer sb = new StringBuffer();
                sb.append("查询到了符合的车辆");
                sb.append("\n");
                sb.append("车辆名称："+evcard.getVehicleModelName());
                sb.append("\n");
                sb.append("车牌号：" + evcard.getVehicleNo());
                sb.append("\n");
                sb.append("可行驶距离："+evcard.getDrivingRange());
                DingTalkMesg.callMe(sb.toString());
                QUERYS.remove(option);
                return true;
            }
        }

        return false;
    }


}
