package cc.fyp.testinfo.deft;

/**
 * @author von
 * @description:
 * @date 2019-07-0219:42
 */
public interface BInterface {

    default void doB(){
        System.out.println("dobbbbbbb");
    }

    default void doX(){
        System.out.println("xxxxxxxx");
    };

}
