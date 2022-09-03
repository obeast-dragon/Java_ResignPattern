package resignpattern.adapter.class_adapter;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/24 13:58
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String readSD = computer.readSD(new SDCardImpl());
        System.out.println(readSD);

        System.out.println("-------------------------------------------------------------------");

        String readSD1 = computer.readSD(new AdapterTF());
        System.out.println(readSD1);
    }
}
