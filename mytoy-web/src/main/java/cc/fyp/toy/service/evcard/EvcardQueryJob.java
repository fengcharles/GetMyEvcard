package cc.fyp.toy.service.evcard;

import cc.fyp.toy.service.evcard.dto.QueryTask;

public class EvcardQueryJob implements Runnable {

    public QueryTask queryTask;

    @Override
    public void run() {

        while (queryTask.getFlag() && queryTask.timeOut()){
            EvcardService evcardService = new EvcardService();
            Boolean flag = evcardService.findUseCar(queryTask);
            if (flag == true){
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
}
