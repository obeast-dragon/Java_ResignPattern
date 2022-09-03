package resignpattern.flyweight;

/**
 * @author wxl
 * @version 1.0
 * @description: 抽象享元角色
 * @date 2021/12/25 0:29
 */
public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color){
        System.out.println("方块形状" + getShape() + ", 颜色" + color);

    }
}
