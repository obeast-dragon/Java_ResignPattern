package resignpattern.visitor;

/**
 * @author wxl
 * @version 1.0
 * @description: 具体元素类 宠物猫
 * @date 2021/12/26 14:31
 */
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        //访问者给猫喂食
        person.feed(this);
        System.out.println("好好吃，喵喵喵");
    }
}
