package cc.fyp.toy.controller;

import cc.fyp.toy.util.HttpUtils;
import cc.fyp.toy.vo.Results;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "forlt")
public class ShowController {

    @RequestMapping(value = "show")
    public String showbase(HttpServletRequest request, HttpServletResponse response){

        String query = request.getParameter("query");
        String region = request.getParameter("region");
        Integer size = 100;

        List<Results> list =  new ArrayList<>();

        for (int i = 0; i < size; i++) {

            JSONArray resluts =  getJsonObject(i,query,region);

            if (resluts!=null){
                List<Results> list1 = Results.valuesof(resluts);

                for (Results results : list1) {
                    list.add(results);
                }
            }
        }
        request.setAttribute("resluts",list);
        request.setAttribute("query",query);
        request.setAttribute("region",region);

        return "/pages/tool/t";
    }


    private JSONArray getJsonObject(Integer pageNum,String query,String region){

        String restr =  HttpUtils.get("http://api.map.baidu.com/place/v2/search?query="+query+"&page_size=20&page_num="+pageNum+"&scope=1&region="+region+"&output=json&ak=1jSkDLxIvv8kBPGlbSGBmzEq6M7i11yI");
        JSONObject jsonObject = JSONObject.fromObject(restr);
        String status =  jsonObject.getString("status");
        String message = jsonObject.getString("message");

        if (status.equals("0") && message.equals("ok")){
            JSONArray resluts = jsonObject.getJSONArray("results");
            return resluts;
        }
        return null;
    }

}
