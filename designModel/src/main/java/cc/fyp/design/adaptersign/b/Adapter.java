package cc.fyp.design.adaptersign.b;

public class Adapter implements TargetInterface {

    private  TargetClass targetClass;

    Adapter(TargetClass targetClass){
        this.targetClass = targetClass;
    }

    @Override
    public void method1() {
        targetClass.method2();
    }
}
