package cc.fyp.design.base;

import java.util.concurrent.Callable;

/**
 * @author von
 * @description:
 * @date 2019-06-0714:47
 */
public class CaculNumThread implements Callable {

    private Integer start;
    private Integer end;

    public CaculNumThread(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("线程启动：" + Thread.currentThread().getName());
        Integer count = 0;
        for (int i = start; i < end; i++) {
            if (i%7 == 0){
                count++;
            }
        }
        System.out.println("线程结束：" + Thread.currentThread().getName());
        return count;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }
}
