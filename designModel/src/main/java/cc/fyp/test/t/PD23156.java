package cc.fyp.test.t;

/**
 * @author von
 * @description:
 * @date 2019/12/25 17:08
 */
public class PD23156 {

    public static <T extends ClassOne> T getClassOne(){
        return null;
    }

    public static <T extends InterFaceOne> T getInterFaceOne(){
        return null;
    }

    public static <T> void pringType(T o){
        System.out.println("gi");
    }

    public static <T extends  ClassTwo> void pringType(T o){
        System.out.println("gi11111");
    }

    public static void main(String[] args) {
        ClassOne c1 = getClassOne();
        InterFaceOne i1 = getInterFaceOne();

        pringType(c1);
        pringType(i1);

        pringType(getClassOne());
        pringType(getInterFaceOne());
    }


}
