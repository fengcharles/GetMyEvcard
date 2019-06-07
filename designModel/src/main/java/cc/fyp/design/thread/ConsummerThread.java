package cc.fyp.design.thread;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author von
 * @description:
 * @date 2019-06-0715:58
 */
public class ConsummerThread implements Runnable  {


    private CopyOnWriteArrayList<Product> list;
    private Integer mod;

    public ConsummerThread(CopyOnWriteArrayList<Product> list,Integer mod) {
        this.list = list;
        this.mod = mod;
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        try {
            System.out.println(threadName +"上岗");

            while (true){
                    synchronized (list){
                        Thread.sleep(1000);

                        if (list.size()<3){
                            list.notifyAll();
                        }

                        long count = list.stream().filter(x -> x.getIndex() % mod == 0).count();

                        if (count == 0){
                            System.out.println(threadName+"说：篮子里面现在没有了，需要生产");
                            list.wait();
                        }

                        Iterator<Product> iterator =  list.iterator();
                        while (iterator.hasNext()){
                            Product next = iterator.next();
                            if (next.getIndex()%mod ==0 ){
                                System.out.println(threadName+"消费了一个产品,产品名称：" + next.getIndex());
                                list.remove(next);
                                Thread.sleep(1000);
                            }
                        }
                    }

                }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
