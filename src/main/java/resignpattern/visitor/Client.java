package resignpattern.visitor;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/26 14:41
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Cat());
        home.add(new Dog());
        home.action(new SomeOne());
        System.out.println("=======================================================================================");
        home.action(new Owner());
    }
}
