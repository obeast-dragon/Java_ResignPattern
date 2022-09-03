package resignpattern.decorator;

/**
 * @author wxl
 * @version 1.0
 * @description: 抽象装饰（Decorator）角色
 * @date 2021/12/24 19:46
 */
public abstract class Garnish extends FastFood{

    //声明快餐类
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
