package cc.fyp.toy.service.evcard.dto;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * evcard 基础返回值
 */
public class EvcardComm {

    private Integer serialNum;
    private Integer status;
    private String message;
    private String serviceName;
    private String token;
    private String dataList;


    public <T> T loadData  (Class<T> cla){
        T  xx = JSONObject.parseObject(dataList,cla);
        return xx;
    }


    public <T> List<T> loadDataList  (Class<T> cla){
        List<T> lists = JSONArray.parseArray(dataList,cla);
        return lists;
    }

    public String getDataList() {
        return dataList;
    }

    public void setDataList(String dataList) {
        this.dataList = dataList;
    }

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
