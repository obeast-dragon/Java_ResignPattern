package resignpattern.singleton;

/**
 * @author wxl
 * @version 1.0
 * @description: 单例模式第4种: 可以使用
 * 懒汉式通过synchronized解决
 *  线程安全问题
 *缺点：速度慢
 * @date 2021/12/22 20:48
 */
public class Mg04 {
    private static Mg04 INSTANCE;

    private  Mg04() {
    }


    public static synchronized Mg04 getInstance() throws Exception{
        if (INSTANCE == null){
            Thread.sleep(500);
            INSTANCE =  new Mg04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> {
                try {
                    System.out.println(Mg04.getInstance().hashCode());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
