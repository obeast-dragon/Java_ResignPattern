package resignpattern.singleton;

/**
 * @author wxl
 * @version 1.0
 * @description: 单例模式第6种: 可使用
 * 懒汉式通过synchronized解决
 *  线程安全问题双重判断
 *
 *缺点：速度慢
 * @date 2021/12/22 20:48
 */
public class Mg06 {
    private static volatile Mg06 INSTANCE;//指令重排问题 JIT

    private Mg06() {
    }


    public static Mg06 getInstance() throws Exception{
        if (INSTANCE == null){
            //妄想通过减少同步代码块的方式提高效率，不可行
            synchronized (Mg06.class){
                if (INSTANCE == null){
                    Thread.sleep(50);
                    INSTANCE =  new Mg06();
                    /*字节码层
                    JIT即时编译
                    1.分配空间
                    2.初始化
                    3.引用赋值

                    2.3可以交换
                    加上volatile防止重新排序
                    */
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> {
                try {
                    System.out.println(Mg06.getInstance().hashCode());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
