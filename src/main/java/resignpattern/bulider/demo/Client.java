package resignpattern.bulider.demo;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/24 0:17
 */
public class Client {


    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }

}
