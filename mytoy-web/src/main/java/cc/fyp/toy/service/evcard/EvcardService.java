package cc.fyp.toy.service.evcard;

import cc.fyp.toy.service.evcard.dto.Evcards;
import cc.fyp.toy.util.HttpClientUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvcardService {

    private static final String GETCARD_URL = "https://mas.evcard.vip:8443/evcard-mas/evcardapp?service=getVehicleInfoList";

    public void loadCard(String option){


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("canRent",1);
        jsonObject.put("shopSeq",option);
        jsonObject.put("token","9bedfbf3-b785-4036-8936-835ab1441da7");
        jsonObject.put("vehicleModelSeq","");

        String result = HttpClientUtil.postJson(GETCARD_URL,jsonObject.toString());
        JSONObject json =  JSONObject.parseObject(result);
        JSONArray jsonArray = json.getJSONArray("dataList");

        List<Evcards> list = JSONArray.parseArray(jsonArray.toJSONString(), Evcards.class);

        for (Evcards evcard : list) {
            System.out.println(evcard.getShopName());
        }

    }

}
