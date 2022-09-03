package resignpattern.Jvm;


/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/29 22:34
 */
public class Math {
    private static final int init = 666;
    private static User user = new User();

    public int cumpute(){
        int a = 1;
        int b = 2;
        int c = (a + b) * 10;
        return c;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.cumpute();
        System.out.println("test");
    }
}
