package cc.fyp.toy.service.evcard.outapi;

import cc.fyp.toy.controller.EvcardController;
import cc.fyp.toy.service.evcard.dto.*;
import cc.fyp.toy.util.HttpClientUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
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
     * @return
     */
    public JSONObject getVehicleInfoList(String param,EvcardHeader header){
        JSONObject json = this.callEvcard(header,param,SERVICE_VEHICLEiNFO);
        return json;
    }

    /**
     * 从某个停车点获取符合条件的车辆
     * @return
     */
    public List<Evcards> findCards(QueryCardReqst param,EvcardHeader header){

        try {
            JSONObject strParam = (JSONObject) JSONObject.toJSON(param);
            JSONObject json = this.callEvcard(header,strParam.toString(),SERVICE_VEHICLEiNFO);
            JSONArray jsonArray = json.getJSONArray("dataList");
            logger.info("原始请求结果：{}",json);
            List<Evcards> list = JSONArray.parseArray(jsonArray.toJSONString(), Evcards.class);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    /**
     * 预约
     * @param seq 取车门店
     * @param vin 汽车vin码
     * @return
     */
    public  EvcardComm order(EvcardHeader header,String seq,String vin){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("origin","evcardios");
        jsonObject.put("isInsurance","1");
        jsonObject.put("planpickupstoreseq",seq);
        jsonObject.put("vin",vin);
        jsonObject.put("token",header.getToken());
        jsonObject.put("authId",USERID);

        JSONObject result = this.callEvcard(header,jsonObject.toString(),SERVICE_ORDERVEHICLE);
        logger.info("原始请求结果：{}",result);
        EvcardComm resp =  result.toJavaObject(EvcardComm.class);
        return  resp;
    }


    /**
     * 订单列表
     * @return
     */
    public  EvcardComm orderList(EvcardHeader header){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss000");
        String updateTime = simpleDateFormat.format(new Date());

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("token",header.getToken());
        jsonObject.put("authId",USERID);
        jsonObject.put("updatedTime",updateTime);

        JSONObject result = this.callEvcard(header,jsonObject.toJSONString(),SERVICE_GETORDERLIST);
        logger.info("原始请求结果：{}",result);
        EvcardComm evcardComm = result.toJavaObject(EvcardComm.class);
        return evcardComm;
    }

    /**
     * 登录
     * @return
     */
    public String login(EvcardHeader header){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("password","qwe123qwe");
        jsonObject.put("loginName","13052375352");
        jsonObject.put("imei","77D2CFE3-D9E4-4A4B-A6A9-A2EE341026D4");
        jsonObject.put("channelId","5381592763294563900");
        jsonObject.put("version","2.20.0");
        jsonObject.put("appType","1");
        jsonObject.put("loginOrigin","0");

        JSONObject result = this.callEvcard(header,jsonObject.toString(),SERVICE_LOGIN);
        logger.info("原始请求结果：{}",result);
        EvcardComm evcardComm =  result.toJavaObject(EvcardComm.class);

        return evcardComm.getToken();

    }

    private JSONObject callEvcard(EvcardHeader header,String param,String service){

        try {
            OkHttpClient client = new OkHttpClient();
            MediaType mediaType = MediaType.parse("application/octet-stream");
            RequestBody body = RequestBody.create(mediaType,param);
            Request request = new Request.Builder()
                    .url(GETCARD_URL + service)
                    .post(body)
                    .addHeader("TimeStamp", header.getTimeStamp())
                    .addHeader("appkey", header.getAppkey())
                    .addHeader("random", header.getRandom())
                    .addHeader("sign", header.getSign())
                    .addHeader("token", header.getToken())
                    .build();

            Response response = client.newCall(request).execute();
            JSONObject jsonObject = JSONObject.parseObject(response.body().string());
            return jsonObject;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
