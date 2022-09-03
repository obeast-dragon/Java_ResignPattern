package resignpattern.visitor;

/**
 * @author wxl
 * @version 1.0
 * @description: 抽象访问者 喂养的人
 * @date 2021/12/26 14:30
 */
public interface Person {

    void feed(Cat cat);

    void feed(Dog dog);
}
