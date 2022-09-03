package resignpattern.decorator;

/**
 * @author wxl
 * @version 1.0
 * @description: 鸡蛋类 具体装饰（ConcreteDecorator）角色
 * @date 2021/12/24 19:49
 */
public class Egg extends Garnish{
    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
