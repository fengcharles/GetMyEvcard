package cc.fyp.design.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author von
 * @description:
 * @date 2019-06-0715:56
 */
public class ProductHome {


    public static CopyOnWriteArrayList<Product> list = new CopyOnWriteArrayList();


    public static void main(String[] args) throws Exception {

        CreateThread createThread = new CreateThread(list,3);
        new Thread(createThread).start();
        CreateThread createThread1 = new CreateThread(list,3);
        new Thread(createThread1).start();
        CreateThread createThread2 = new CreateThread(list,3);
        new Thread(createThread2).start();


        ConsummerThread consummerThread = new ConsummerThread(list,3);
        new Thread(consummerThread).start();
        ConsummerThread consummerThread1 = new ConsummerThread(list,5);
        new Thread(consummerThread1).start();
        ConsummerThread consummerThread2 = new ConsummerThread(list,6);
        new Thread(consummerThread2).start();

    }

}
