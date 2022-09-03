package resignpattern.singleton;

/**
 * @author wxl
 * @version 1.0
 * @description: 单例模式第一种: 可以使用
 * 类加载到内存，就实例化一个实例，Jvm保证线程安全
 * 唯一缺点：不管是否用到，类加载是就完成实例化
 * @date 2021/12/22 20:48
 */
public class Mg01 {
    private static final Mg01 INSTANCE = new Mg01();

    private Mg01() {
    }

    public static Mg01 getInstance(){
        return INSTANCE;
    }


}
