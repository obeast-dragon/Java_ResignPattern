package resignpattern.template;

/**
 * @author wxl
 * @version 1.0
 * @description: 抽象类（模板方法和基本方法）
 * @date 2021/12/25 10:07
 */
public abstract class AbstractClass {

    //模板方法定义的规则
    public final void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }



    //基本方法
    public void pourOil(){
        System.out.println("倒油");
    }
    //基本方法
    public void heatOil(){
        System.out.println("热油");
    }
    //基本方法
    public void fry(){
        System.out.println("炒菜");
    }

    //倒包菜 抽象方法
    public abstract void pourVegetable();

    //倒调料品
    public abstract void pourSauce();


}
