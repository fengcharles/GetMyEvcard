package cc.fyp.design.reloadoverwrite;

import java.io.IOException;

/**
 * @author von
 * @description:
 * @date 2019-06-0720:34
 */
public class Child extends Parent {

    /**
     * 重写
     *   作用域必须大于等于父方法
     *   抛出的异常小于等于父方法
     *
     * @param x
     * @return
     */
    @Override
    public Integer test(Integer x) throws IOException {
        return 2;
    }


    /**
     * 重载  参数必须不同
     *
     * @param y
     * @return
     */
    public Integer show(Integer y){
        return 2;
    }

    public Integer show(Integer y,Integer x){
        return 3;
    }

    public Long show(Integer y,Long mm){
        return 3L;
    }

    protected Long show(Double x){
        return  4L;
    }


}
