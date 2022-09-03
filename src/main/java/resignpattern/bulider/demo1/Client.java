package resignpattern.bulider.demo1;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/24 0:57
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星")
                .memory("金士顿")
                .mainBoard("华硕")
                .build();
        System.out.println(phone);
    }
}
