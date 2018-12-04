package cc.fyp.toy.service.mesg;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DingTalkMesg {

    private static final String WEBHOOK_TOKEN = "https://oapi.dingtalk.com/robot/send?access_token=ca674db7ba5a77591873d1a1b9345cdac4c2c0953e8b2c00e3826375acc74bbd";


    public  static  void callMe (String mesg){

        try {
            HttpClient httpclient = HttpClients.createDefault();

            HttpPost httppost = new HttpPost(WEBHOOK_TOKEN);
            httppost.addHeader("Content-Type", "application/json; charset=utf-8");

            JSONObject mesgJson = new JSONObject();
            JSONObject content = new JSONObject();
            JSONObject atInfo = new JSONObject();
            List<Long> mobiles = Arrays.asList(13052375352L);
            mesgJson.put("msgtype","text");

            content.put("content",mesg);
            mesgJson.put("text",content);
            atInfo.put("atMobiles",mobiles);
            mesgJson.put("at",atInfo);

            StringEntity se = new StringEntity(mesgJson.toString(), "utf-8");
            httppost.setEntity(se);

            HttpResponse response = httpclient.execute(httppost);
            if (response.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
                String result= EntityUtils.toString(response.getEntity(), "utf-8");
                System.out.println(result);
            }
        } catch (UnsupportedCharsetException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public static void main(String args[]) throws Exception{

        callMe("你好:");

    }

}
