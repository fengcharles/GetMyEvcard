package cc.fyp.design.thread;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author von
 * @description:
 * @date 2019-06-0715:58
 */
public class CreateThread implements Runnable {

    private CopyOnWriteArrayList<Product> list;
    private Integer mod;

    public CreateThread(CopyOnWriteArrayList<Product> list,Integer mod) {
        this.list = list;
        this.mod = mod;
    }

    @Override
    public void run() {

        try {
            String threadName = Thread.currentThread().getName();
            System.out.println( threadName + "开始上岗");

            while (true){
                synchronized (list){
                    if (list.size() >10){
                        System.out.println("篮子里面现在已经有满了，暂时不生产了");
                        list.notifyAll();
                        list.wait();
                    }
                    Product product = new Product();
                    product.setIndex(list.size()+1);
                    product.setCreatName(Thread.currentThread().getName());
                    list.add(product);
                    Thread.sleep(500);
                    System.out.println(threadName + "生产了一个商品，放入篮子。。。。,篮子数量："+ list.size());

                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
