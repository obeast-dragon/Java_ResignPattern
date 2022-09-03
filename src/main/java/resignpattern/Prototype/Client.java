package resignpattern.Prototype;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/23 21:53
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Reailzetype reailzetype = new Reailzetype();
        Reailzetype clone1 = reailzetype.clone();
        System.out.println("原型对象和克隆出来的是否同一个对象？" + (reailzetype == clone1));

    }
}
