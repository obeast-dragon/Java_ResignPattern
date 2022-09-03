package resignpattern.singleton;

/**
 * @author wxl
 * @version 1.0
 * @description: 单例模式第2种: 可以使用
 * 静态代码块
 * 类加载到内存，就实例化一个实例，Jvm保证线程安全
 * 唯一缺点：不管是否用到，类加载是就完成实例化
 * @date 2021/12/22 20:48
 */
public class Mg02 {
    private static final Mg02 INSTANCE;
    static {
        INSTANCE = new Mg02();
    }

    private Mg02() {
    }

    public  static Mg02 getInstance(){
        return INSTANCE;
    }
}
