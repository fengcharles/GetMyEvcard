package cc.fyp.testinfo.deft;

/**
 * 测试接口default的继承关系
 *
 * 如果类Test实现了两个 同样的多个defaut方法doX 则必须重写doX方法
 * 如果类Tett实现了 一个有默认 一个没默认 的同样方法doX 则必须重写doX方法
 *
 */
public class Test implements AInterface,BInterface {

    @Override
    public void doB() {
        System.out.println("Test.DoB");
    }

    @Override
    public void doX() {
        System.out.println("Test.doX");
    }

    public static void main(String[] args) {

        Test t= new Test();
        t.doA();
        t.doB();
        t.doX();

    }

}
