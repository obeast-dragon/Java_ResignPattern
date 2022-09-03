package resignpattern.visitor;

/**
 * @author wxl
 * @version 1.0
 * @description: 具体访问者者 自己
 * @date 2021/12/26 14:36
 */
public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }
}
