package resignpattern.singleton;

/**
 * @author wxl
 * @version 1.0
 * @description: 单例模式第7种: 可以使用
 * 静态内部类
 * jvm保证线程安全
 * 虚拟机加载内存的时候只加载一次
 * @date 2021/12/22 20:48
 */
public class Mg07 {

    private static class Mg07Holder{
        private static final Mg07 INSTANCE = new Mg07();
    }

    private Mg07() {
    }

    public static Mg07 getInstance(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Mg07Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            new Thread(()-> System.out.println(Mg07.getInstance().hashCode())).start();
        }
    }
}

