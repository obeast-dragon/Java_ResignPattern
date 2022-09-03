package resignpattern.Factory.abstract_factory;

/**
 * @author wxl
 * @version 1.0
 * @description: 中国工厂
 * @date 2021/12/23 20:17
 */
public class ChineseDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new BlueMountainCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Cookie();
    }
}
