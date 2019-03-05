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
 *
 * 学习总结:
 * 我们现在有一个类,这个类的 A方法所需要的参数(假设3个) 已经满足不了我们的需求了,但是又不能修改他(开-闭原则思想).
 * 因此:我们创建一个适配器类并 实现他的这个接口,新方法对参数稍加修改(增加到4个),然后调用他原来的功能. 这样对外就变成4个参数
 * 并且还能调用原来的3个参数方法.
 *
 * 感想:
 * 如果这个类没有实现任何接口,我们需要扩展参数只能修改代码,此时必然违背开闭原则的设计.
 * 所以spring框架要求我们按照接口编程不是没有道理的.
 *
 */
public class App {

    public static void main(String[] args) {

        TargetInterface adapter = new Adapter();

        adapter.method1();

    }
}
