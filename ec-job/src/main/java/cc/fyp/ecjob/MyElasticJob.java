package cc.fyp.ecjob;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

/**
 * @author von
 * @description:
 * @date 2019-07-0821:06
 */
public class MyElasticJob implements SimpleJob {

    private  int x = 1;

    @Override
    public void execute(ShardingContext shardingContext) {
        int shardingItem = shardingContext.getShardingItem();
        System.out.println(shardingItem+"=========");

        while (true){

            try {
                System.out.println("哈哈哈哈哈------");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
