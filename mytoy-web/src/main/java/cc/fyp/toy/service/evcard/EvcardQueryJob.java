package cc.fyp.toy.service.evcard;

import cc.fyp.toy.service.evcard.dto.QueryDTO;

public class EvcardQueryJob implements Runnable {

    public  QueryDTO queryDTO;

    @Override
    public void run() {

        while (true && queryDTO.timeOut()){
            EvcardService evcardService = new EvcardService();
            Boolean flag = evcardService.findUseCar(queryDTO);
            if (flag == true){
                break;
            }
            try {
                Thread.sleep(queryDTO.getQuerySeq());
            } catch (InterruptedException e) {
                EvcardService.QUERYS.remove(queryDTO);
            }
        }
        EvcardService.QUERYS.remove(queryDTO);
    }

    public QueryDTO getQueryDTO() {
        return queryDTO;
    }

    public void setQueryDTO(QueryDTO queryDTO) {
        this.queryDTO = queryDTO;
    }
}
