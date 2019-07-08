package cc.fyp.testinfo.deft;

/**
 * @author von
 * @description:
 * @date 2019-07-0219:42
 */
public interface AInterface {

    default void doA(){
        System.out.println("doaaaaaaaa");
    }

    default void doX(){
        System.out.println("doXXXXXXXXX");
    }

}
