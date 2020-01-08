package cc.fyp.design.thread.sync;

/**
 * @author von
 * @description:
 * @date 2019-11-27 16:47
 */
public class SyncDemo {

    static class Sync{
        public static synchronized void method(){
            System.out.println("method begin");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("method end");
        }
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            Sync sync = new Sync();
            sync.method();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread thread = new MyThread();
            thread.start();
        }
    }

}
