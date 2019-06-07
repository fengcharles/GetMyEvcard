package cc.fyp.design.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.function.Function;

/**
 * @author von
 * @description:
 * @date 2019-06-0709:17
 */
public class CacluNum  {


    public static int printInfo(Integer n){
        Integer count = 0;
        for (int i = 7; i < n; i++) {
            if (i%7 == 0){
                count++;
            }
        }
        String x = "";
        return  count;

    }

    /**
     * 这种方式并不会很快 要比第一种慢一倍
     * @param n
     * @return
     */
    public static int printInfo1(Integer n){
        Integer count = 0;
        for (int i = 7; i < n; i=i+7) {
            if (i%7 == 0){
                count++;
            }
        }
        return  count;
    }


    public static int threadCal(Integer n){

        try
        {
            int a = n/2;

            CaculNumThread caculNumThread = new CaculNumThread(1,a);
            FutureTask<Integer> futureTask = new FutureTask(caculNumThread);

            CaculNumThread caculNumThread1 = new CaculNumThread(a,n);
            FutureTask<Integer> futureTask1 = new FutureTask(caculNumThread1);


            ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
            cachedThreadPool.submit(futureTask);
            cachedThreadPool.submit(futureTask1);


            Integer count1 = futureTask.get();
            Integer count2 = futureTask1.get();

            return count1 + count2;

        }catch (Exception e){
            e.printStackTrace();
        }

        return 1;
    }



    public static int caculFuntion(Function<Integer,Integer> function,Integer n){
        long start = System.currentTimeMillis();
        Integer re = function.apply(n);
        System.out.println(System.currentTimeMillis() - start+"ms");
        return  re;
    }


    public static void main(String[] args) throws Exception {
        int x = Integer.MAX_VALUE;
        int count =  caculFuntion(CacluNum::printInfo,x);
        int count1 = caculFuntion(CacluNum::printInfo1,x);

        int count3 = caculFuntion(CacluNum::threadCal, x);

        System.out.println(count + "======" +count1 +"=====" + count3);
    }
}
