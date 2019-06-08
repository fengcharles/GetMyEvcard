package cc.fyp.design.proxy;

import java.lang.reflect.Proxy;

/**
 *
 *
 * 实现动态代理的两个基本工具类
 * 1、实现InvocationHandler接口，拦截类的方法，并重新添加一些新元素。
 * 2、使用Proxy类生成新的代理类。
 *
 * @author von
 * @description:
 * @date 2019-06-0814:40
 */
public class Runner {


    public static void main(String[] args) {

        IGamer gamer = new JyzjGamer("FYP");
        GamerInvocationHander gamerInvocationHander = new GamerInvocationHander(gamer);
        Class<?>[] cls = new Class[]{IGamer.class};

        //这个类就是新的代理类，已经不是原来的gamer了
        IGamer neGamer =(IGamer)Proxy.newProxyInstance(gamer.getClass().getClassLoader(), cls, gamerInvocationHander);

        neGamer.exit();
        neGamer.login("xxx");

    }
}
