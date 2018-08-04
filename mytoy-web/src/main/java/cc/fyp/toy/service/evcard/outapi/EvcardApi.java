package cc.fyp.toy.service.evcard.outapi;

import cc.fyp.toy.controller.EvcardController;
import cc.fyp.toy.service.evcard.dto.EvcardOrderResp;
import cc.fyp.toy.service.evcard.dto.Evcards;
import cc.fyp.toy.service.evcard.dto.QueryDTO;
import cc.fyp.toy.util.HttpClientUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EvcardApi {

    private final static Logger logger = LoggerFactory.getLogger(EvcardController.class);

    private static final String GETCARD_URL = "https://mas.evcard.vip:8443/evcard-mas/evcardapp?service=";
    private static final String SERVICE_VEHICLEiNFO = "getVehicleInfoList";
    private static final String SERVICE_ORDERVEHICLE = "orderVehicle";
    public static  final String USERID = "13052375352234201563";

    public static final List<String> smallList = new ArrayList<>();
    static {
        smallList.add("奇瑞EQ");
        smallList.add("荣威E50");
        smallList.add("奇瑞eq1（小蚂蚁）");
    }

    /**
     * 从某个停车点获取符合条件的车辆
     * @param option
     * @return
     */
    public  List<Evcards> queryCard(QueryDTO option){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("canRent",1);
        jsonObject.put("shopSeq",option.getOption());
        jsonObject.put("token","9bedfbf3-b785-4036-8936-835ab1441da7");
        jsonObject.put("vehicleModelSeq","");

        String result = HttpClientUtil.postJson(GETCARD_URL + SERVICE_VEHICLEiNFO,jsonObject.toString());
        JSONObject json =  JSONObject.parseObject(result);
        JSONArray jsonArray = json.getJSONArray("dataList");
        logger.info("原始请求结果：{}",json);
        List<Evcards> list = JSONArray.parseArray(jsonArray.toJSONString(), Evcards.class);
        return  list;
    }


    /**
     * 预约
     * @param seq 取车门店
     * @param vin 汽车vin码
     * @return
     */
    public  EvcardOrderResp order(String seq,String vin){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("origin","evcardios");
        jsonObject.put("isInsurance","1");
        jsonObject.put("planpickupstoreseq",seq);
        jsonObject.put("vin",vin);
        jsonObject.put("token","44e2d031-0e74-440a-83d2-6756a2eeb02b");
        jsonObject.put("authId",USERID);

        String result = HttpClientUtil.postJson(GETCARD_URL + SERVICE_ORDERVEHICLE,jsonObject.toString());
        logger.info("原始请求结果：{}",result);
        EvcardOrderResp resp =  JSONObject.parseObject(result,EvcardOrderResp.class);
        return  resp;
    }

}
