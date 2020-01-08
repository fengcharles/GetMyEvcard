package cc.fyp.test;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
 * @author von
 * @description:
 * @date 2019-08-2016:05
 */
public class RocketMqProducter {


    public static void main(String[] args) throws Exception {

        DefaultMQProducer producer = new
                DefaultMQProducer("data_Collection_producer");

        producer.setNamesrvAddr("charlespc:9876");

        producer.start();

        for (int i = 0; i <10 ; i++) {

            byte[] bytes = "测试发送消息".getBytes();

            Message msg1 = new Message("SHJ_TOPIC_DATA_COLLECTION" ,"getVerificationCode" , bytes);
            SendResult sendResult1 = producer.send(msg1);
            System.out.println(sendResult1);
        }


        producer.shutdown();

    }


}
