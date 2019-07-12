package cc.fyp.test;

/**
 * @author von
 * @description:
 * @date 2019-07-1215:03
 */
public class EquelTest {

    public static void main(String[] args) {
        Integer x = 10;
        Integer y = 10;

        System.out.println(x.equals(y));
        System.out.println(x == y);

        Integer z = new Integer(10);
        Integer a = new Integer(10);

        System.out.println(z == a);
        System.out.println(z.equals(a));

    }

}
