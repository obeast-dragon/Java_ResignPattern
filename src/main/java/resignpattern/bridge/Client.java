package resignpattern.bridge;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/24 20:35
 */
public class Client {
    public static void main(String[] args) {
        OperatingSystem system = new Mac(new AVIFile());
        system.play("战狼3");
        OperatingSystem system1 = new Windows(new RMVBFile());
        system1.play("好运来");

    }
}
