package resignpattern.template;

/**
 * @author wxl
 * @version 1.0
 * @description: 炒包菜 具体子类
 * @date 2021/12/25 10:14
 */
public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("爆炒调料");
    }
}
