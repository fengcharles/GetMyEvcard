package cc.fyp.design.thread.sync;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author von
 * @description:
 * @date 2019-11-28 11:00
 */
public class AddDemo extends Thread {


    static AtomicInteger i = new AtomicInteger(0);

    static int x = 0;
    static int y = 0;
    static int z = 0;
    static int w = 0;

    /**
     * 原子int 不用加锁 可以实现自增
     */
    private void increment(){
        i.incrementAndGet();
    }

    /**
     * 对象方法锁 （不同对象不安全）
     */
    private synchronized void increment1(){
        x++;
    }


    /**
     * 对象方法锁 （不同对象不安全）
     */
    private  void increment4(){

        synchronized (this){
            w++;
        }

    }

    /**
     * 类方法锁  （不同对象安全）
     */
    private static synchronized void increment2(){
        y++;
    }

    /**
     * 类方法锁 （不同对象安全）
     */
    private void increment3(){

        synchronized (AddDemo.class){
            z++;
        }

    }

    @Override
    public void run() {

        for (int j = 0; j < 1000000; j++) {
            increment();
            increment1();
            increment2();
            increment3();
            increment4();
        }

    }


    public static void main(String[] args) throws Exception {
//        AddDemo a = new AddDemo();
//        Thread thread = new Thread(a);
//        Thread thread1 = new Thread(a);
//        Thread thread2 = new Thread(a);
//
//        thread.start();
//        thread1.start();
//        thread2.start();
//
//        thread.join();
//        thread1.join();
//        thread2.join();
//
//        System.out.println(i);
        System.out.println("==========相同对象的结果=============");
        //同一个对象
        AddDemo a = new AddDemo();

        Thread thread = new Thread(a);
        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(a);

        thread.start();
        thread1.start();
        thread2.start();

        thread.join();
        thread1.join();
        thread2.join();

        System.out.println("i=" + i);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        System.out.println("w=" + w);

        System.out.println("==========不同对象的结果=============");

        AddDemo b = new AddDemo();
        AddDemo c = new AddDemo();
        AddDemo d = new AddDemo();

        Thread thread3 = new Thread(b);
        Thread thread4 = new Thread(c);
        Thread thread5 = new Thread(d);

        thread3.start();
        thread4.start();
        thread5.start();

        thread3.join();
        thread4.join();
        thread2.join();

        System.out.println("i=" + i);
        System.out.println("x（不安全）=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        System.out.println("w（不安全）=" + w);



    }


}
