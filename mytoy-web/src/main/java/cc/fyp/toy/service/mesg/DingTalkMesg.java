package cc.fyp.toy.service.mesg;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class DingTalkMesg {

    private static final String WEBHOOK_TOKEN = "https://oapi.dingtalk.com/robot/send?access_token=29cdd3647ddf211fc8837f27f4deb47c6a8295b98efe4687639e23f1bd083a3a";


    public  static  void callMe (String mesg)throws Exception{

        HttpClient httpclient = HttpClients.createDefault();

        HttpPost httppost = new HttpPost(WEBHOOK_TOKEN);
        httppost.addHeader("Content-Type", "application/json; charset=utf-8");

        String textMsg = "{ \"msgtype\": \"text\", \"text\": {\"content\": \""+mesg+"\"}}";
        StringEntity se = new StringEntity(textMsg, "utf-8");
        httppost.setEntity(se);

        HttpResponse response = httpclient.execute(httppost);
        if (response.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
            String result= EntityUtils.toString(response.getEntity(), "utf-8");
            System.out.println(result);
        }


    }


    public static void main(String args[]) throws Exception{

        callMe("haha ");

    }

}
