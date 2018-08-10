package cc.fyp.toy.service.evcard.outapi;

import cc.fyp.toy.controller.EvcardController;
import cc.fyp.toy.service.evcard.dto.EvcardComm;
import cc.fyp.toy.service.evcard.dto.EvcardOrderResp;
import cc.fyp.toy.service.evcard.dto.Evcards;
import cc.fyp.toy.service.evcard.dto.QueryDTO;
import cc.fyp.toy.util.HttpClientUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EvcardApi {

    private final static Logger logger = LoggerFactory.getLogger(EvcardController.class);

    private static final String GETCARD_URL = "https://mas.evcard.vip:8443/evcard-mas/evcardapp?service=";
    private static final String SERVICE_VEHICLEiNFO = "getVehicleInfoList";
    private static final String SERVICE_ORDERVEHICLE = "orderVehicle";
    private static final String SERVICE_GETORDERLIST = "getOrderList";
    private static final String SERVICE_LOGIN = "login";
    public static  final String USERID = "13052375352234201563";
    public static  String TOKEN = "dc000205-6ed5-44d3-8deb-5a3ef5442722";

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
        jsonObject.put("token",TOKEN);
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
        jsonObject.put("token",this.login());
        jsonObject.put("authId",USERID);

        String result = HttpClientUtil.postJson(GETCARD_URL + SERVICE_ORDERVEHICLE,jsonObject.toString());

        logger.info("原始请求结果：{}",result);
        EvcardComm resp =  JSONObject.parseObject(result,EvcardComm.class);
        EvcardOrderResp xx = resp.loadData(EvcardOrderResp.class);

        return  xx;
    }


    /**
     * 订单列表
     * @return
     */
    public  EvcardComm orderList(){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss000");
        String updateTime = simpleDateFormat.format(new Date());

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("token",TOKEN);
        jsonObject.put("authId",USERID);
        jsonObject.put("updatedTime",updateTime);

        String result = HttpClientUtil.postJson(GETCARD_URL + SERVICE_GETORDERLIST,jsonObject.toString());
        logger.info("原始请求结果：{}",result);
        EvcardComm evcardComm = JSONObject.parseObject(result,EvcardComm.class);
        return evcardComm;
    }

    /**
     * 登录
     * @return
     */
    public String login(){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("password","qwe123qwe");
        jsonObject.put("loginName","13052375352");
        jsonObject.put("imei","77D2CFE3-D9E4-4A4B-A6A9-A2EE341026D4");
        jsonObject.put("channelId","5381592763294563900");
        jsonObject.put("version","2.20.0");
        jsonObject.put("appType","1");
        jsonObject.put("loginOrigin","0");

        String result = HttpClientUtil.postJson(GETCARD_URL + SERVICE_LOGIN,jsonObject.toString());
        logger.info("原始请求结果：{}",result);
        EvcardComm evcardComm = JSONObject.parseObject(result,EvcardComm.class);

        return evcardComm.getToken();

    }
}
