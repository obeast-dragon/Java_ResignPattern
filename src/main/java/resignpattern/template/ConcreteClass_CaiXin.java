package resignpattern.template;

/**
 * @author wxl
 * @version 1.0
 * @description: 炒菜心 具体子类
 * @date 2021/12/25 10:14
 */
public class ConcreteClass_CaiXin extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("白灼调料");
    }
}
