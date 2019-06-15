package cc.fyp.design.proxy;


import org.springframework.cglib.proxy.Enhancer;

/**
 * 基于CGLIB的动态代理实现
 */
public class CglibRunner {


    public static void main(String[] args) {

        DhxyGamerCglib dhxyGamerCglib = new DhxyGamerCglib();
        DhxyGamer dhxyGamerProxy =(DhxyGamer) dhxyGamerCglib.getInstance(new DhxyGamer());
        dhxyGamerProxy.login();


    }
}
