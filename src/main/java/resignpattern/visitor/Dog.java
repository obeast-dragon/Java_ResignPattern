package resignpattern.visitor;

/**
 * @author wxl
 * @version 1.0
 * @description: 具体元素类
 * @date 2021/12/26 14:31
 */
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        //访问者给狗喂食
        person.feed(this);
        System.out.println("好好吃，汪汪汪");
    }
}
