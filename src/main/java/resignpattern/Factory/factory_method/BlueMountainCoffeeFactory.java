package resignpattern.Factory.factory_method;

/**
 * @author wxl
 * @version 1.0
 * @description: 具体蓝山咖啡工厂
 * @date 2021/12/23 19:57
 */
public class BlueMountainCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new BlueMountainCoffee();
    }
}
