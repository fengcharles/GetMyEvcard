package cc.fyp.toy.vo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Results {

    private String name;
    private String addr;
    private String telephone;


    public static List<Results> valuesof(JSONArray jsonArray){

        List<Results> list = new ArrayList<>();

        for (Object obj : jsonArray) {

           Results results = new Results();
           JSONObject jsonObject =  JSONObject.fromObject(obj);

           String name = (String) jsonObject.get("name");
           String address = (String)  jsonObject.get("address");
           String telephone = (String)  jsonObject.get("telephone");
           results.setName(name);
           results.setAddr(address);
           results.setTelephone(telephone);
           list.add(results);
        }
        return list;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
