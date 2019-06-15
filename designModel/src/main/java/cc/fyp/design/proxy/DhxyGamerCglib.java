package cc.fyp.design.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author von
 * @description:
 * @date 2019-06-1509:03
 */
public class DhxyGamerCglib implements MethodInterceptor {
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return  enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (method.getName().equals("login")){
            System.out.println("调用了dhxy登录方法");
            methodProxy.invokeSuper(o,objects);
            System.out.println("调用结束");
        }

        return null;
    }
}
