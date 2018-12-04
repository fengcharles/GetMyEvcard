package cc.fyp.toy.service.evcard;

import cc.fyp.toy.controller.WebSocket;
import cc.fyp.toy.service.evcard.dto.FindCarResultDTO;
import cc.fyp.toy.service.evcard.dto.QueryTask;
import com.alibaba.fastjson.JSONObject;

import java.time.LocalDateTime;

public class EvcardQueryJob implements Runnable {

    public QueryTask queryTask;

    @Override
    public void run() {

        while (queryTask.getFlag() && queryTask.timeOut()){
            EvcardService evcardService = new EvcardService();
            FindCarResultDTO useCar = evcardService.findUseCar(queryTask);
            senMesg(useCar,queryTask);
            if (useCar.getFlag() == true){
                break;
            }
            try {
                Thread.sleep(queryTask.getQuerySeq());
            } catch (InterruptedException e) {
                EvcardService.QUERYS.remove(queryTask);
            }
        }
        EvcardService.QUERYS.remove(queryTask);
    }

    public QueryTask getQueryTask() {
        return queryTask;
    }

    public void setQueryTask(QueryTask queryTask) {
        this.queryTask = queryTask;
    }

    public  void senMesg(FindCarResultDTO useCar,QueryTask queryTask){

        try {
            LocalDateTime dateTime = LocalDateTime.now();
            String val = String.format("%s:%s:%s   状态:%s/%s",dateTime.getHour(),dateTime.getMinute(),dateTime.getSecond(),useCar.getFlag(),useCar.getMesg());
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("option",queryTask.getOption());
            jsonObject.put("mesg",val);
            WebSocket.webSocketSet.forEach(set-> set.sendMessage(jsonObject.toJSONString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
