package resignpattern.Prototype;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/23 21:51
 */
public class Reailzetype implements Cloneable{
    public Reailzetype() {
        System.out.println("具体的原型对象创建完成");
    }

    @Override
    public Reailzetype clone() throws CloneNotSupportedException {
        System.out.println("复制成功");
        return (Reailzetype) super.clone();
    }
}
