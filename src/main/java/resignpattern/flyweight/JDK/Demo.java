package resignpattern.flyweight.JDK;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/25 0:51
 */
public class Demo {
    public static void main(String[] args) {
        Integer l1 = 127;
        Integer l2 = 127;
        System.out.println("第一" + (l2==l1));
        Integer l3 = 128;
        Integer l4 = 128;
        System.out.println("第二" + (l3==l4));
    }
}
