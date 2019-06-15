package cc.fyp.design.proxy;

import org.springframework.cglib.proxy.Callback;

/**
 * @author von
 * @description:
 * @date 2019-06-1508:59
 */
public class DhxyGamer implements Callback {

    public void login(){
        System.out.println("dhxy");
    }

}
