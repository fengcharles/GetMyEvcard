package cc.fyp.design.adaptersign.a;


/***
 *
 * 适配器模式(类适配器)
 *
 * 举例说明:
 *
 * 现在有一个接口 TargetInfterFace 只支持插两个孔
 * 现在有一个类 TargetClass 能支持3个插孔
 * 需求: 必须是实现 TargetInfterFace 接口的类,且能支持3个插孔
 * 实现方法: 用 Adapter类 实现 TargetInfterFace 接口 并继承TargetClass类
 * 在Adapter类中 使用super() 方法调用父类TargetClass的3孔方法.
 *
 * 这样就满足需求了.
 *
 */
public class App {

    public static void main(String[] args) {

        TargetInterface adapter = new Adapter();

        adapter.method1();

    }
}
