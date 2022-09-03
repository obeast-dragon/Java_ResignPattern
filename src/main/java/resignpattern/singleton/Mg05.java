package resignpattern.singleton;

/**
 * @author wxl
 * @version 1.0
 * @description: 单例模式第5种: 不可使用
 * 懒汉式通过synchronized解决
 *  妄想通过减少同步代码块的方式提高效率，不可行
 *缺点：线程安全问题
 * @date 2021/12/22 20:48
 */
public class Mg05 {
    private static Mg05 INSTANCE;

    private Mg05() {
    }


    public static Mg05 getInstance() throws Exception{
        if (INSTANCE == null){
            //妄想通过减少同步代码块的方式提高效率，不可行
            synchronized (Mg05.class){
                Thread.sleep(50);
                INSTANCE =  new Mg05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> {
                try {
                    System.out.println(Mg05.getInstance().hashCode());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
