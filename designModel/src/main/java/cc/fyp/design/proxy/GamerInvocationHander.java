package cc.fyp.design.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author von
 * @description:
 * @date 2019-06-0814:41
 */
public class GamerInvocationHander implements InvocationHandler {

    private Object object;

    public GamerInvocationHander(Object object) {
        this.object = object;
    }


    public Object invoke(Object proxy, Method method, Object[] args){

        Object result = null;
        try {

            if (args!=null){
                Arrays.stream(args).forEach(v-> System.out.println("参数："+ v));
            }
            if (method.getName().equals("exit")){
                System.out.println("退出时间："+System.nanoTime());
            }
            if (method.getName().equals("login")){
                System.out.println("登录游戏时间："+System.nanoTime());
            }

            result= method.invoke(this.object, args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return  result;

    }

}
