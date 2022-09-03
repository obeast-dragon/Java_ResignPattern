package resignpattern.flyweight;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/25 0:42
 */
public class Client {
    public static void main(String[] args) {
        AbstractBox i = BoxFactory.getInstance().getShape("I");
        i.display("blue");
        AbstractBox o = BoxFactory.getInstance().getShape("O");
        o.display("red");
        AbstractBox l = BoxFactory.getInstance().getShape("L");
        l.display("yellow");
        AbstractBox l2 = BoxFactory.getInstance().getShape("L");
        l.display("yellow2");
        System.out.println(l2 == l);
    }
}
