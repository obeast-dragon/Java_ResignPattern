package resignpattern.singleton;

/**
 * @author wxl
 * @version 1.0
 * @description: 单例模式第3种: 不可使用
 * 懒汉式
 *缺点：多线程访问不安全
 * @date 2021/12/22 20:48
 */
public class Mg03 {
    private static  Mg03 INSTANCE;

    private Mg03() {
    }


    public static Mg03 getInstance() throws Exception{
        if (INSTANCE == null){
            Thread.sleep(500);
            INSTANCE =  new Mg03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> {
                try {
                    System.out.println(Mg03.getInstance().hashCode());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
