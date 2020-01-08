package cc.fyp;


import com.sensorsdata.analytics.javasdk.SensorsAnalytics;

import java.util.HashMap;
import java.util.Map;

/**
 * @author von
 * @description:
 * @date 2019-06-2715:22
 */
public class Test {


    public static void main(String[] args) throws Exception {

        String logPath = "/Users/von/logs/sensorslog/salog";

        String distinctId = "ABCEF12314217";
        String URL = "http://data.91top.com/sa?project=default";


        final SensorsAnalytics sa = new SensorsAnalytics(new SensorsAnalytics.ConcurrentLoggingConsumer(logPath));

        //final SensorsAnalytics sa = new SensorsAnalytics(new SensorsAnalytics.DebugConsumer(URL,true));

        Map<String,Object> map = new HashMap<>();
        map.put("userName","77");
        map.put("userAge",777);
        map.put("userSex","男");

        sa.track(distinctId,true,"UserLogin",map);

        sa.shutdown();

    }


}
