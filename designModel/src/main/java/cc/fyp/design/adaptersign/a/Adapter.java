package cc.fyp.design.adaptersign.a;

public class Adapter extends TargetClass implements TargetInterface {

    @Override
    public void method1() {
        super.method2();
    }
}
