package cc.fyp.toy.init;

import cc.fyp.toy.service.evcard.outapi.EvcardApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

/**
 * 初始化用的
 */
@Service
public class InitService {

    private static final Logger logger = LoggerFactory.getLogger(InitService.class);

    @Autowired
    private TaskExecutor taskExecutor;

    @Autowired
    private EvcardApi evcardApi;

    public void initMethod(){

        //启动Evcard Token保持登录活性的线程
        taskExecutor.execute(new Thread(()->{
            logger.info("保持token活性线程开启....");
            while (true){
                evcardApi.orderList();
                logger.info("token探针查询结束.....");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }));
    }

}