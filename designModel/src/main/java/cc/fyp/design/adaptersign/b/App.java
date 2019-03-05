package cc.fyp.design.adaptersign.b;


/***
 *
 * 适配器模式(对象适配器)
 *
 * 类似于类适配器模式,
 * 区别在于 适配器拿到目标类的引用来调动,不用继承目标类
 *
 *
 * 这样就满足需求了.
 *
 */
public class App {

    public static void main(String[] args) {

        TargetInterface targetInterface = new Adapter(new TargetClass());
        targetInterface.method1();


    }
}
