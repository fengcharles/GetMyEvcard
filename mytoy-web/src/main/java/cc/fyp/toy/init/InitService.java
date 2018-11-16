package cc.fyp.toy.init;

import cc.fyp.toy.service.evcard.outapi.EvcardApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 初始化用的
 */
@Service
public class InitService {

    private static final Logger logger = LoggerFactory.getLogger(InitService.class);

    @Autowired
    private EvcardApi evcardApi;

    @Async
    public void initMethod(){

    }

}
