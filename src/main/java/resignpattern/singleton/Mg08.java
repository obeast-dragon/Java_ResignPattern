package resignpattern.singleton;

/**
 * @author wxl
 * @version 1.0
 * @description: 单例模式第7种: 可以使用
 *
 * 不仅可以解决线程同步，还可以防止反序列化（即反射newInstance）。
 *
 * @date 2021/12/22 20:48
 */
public enum Mg08 {
    //之所以不能反序化是因为：枚举类没有构造方法
    //反编译之后是.abstractClass
    INSTANCE;



    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            new Thread(()-> System.out.println(Mg08.INSTANCE.hashCode())).start();
        }
    }
}

