package resignpattern.Mendiator;

/**
 * @author wxl
 * @version 1.0
 * @description:抽象同事类
 * @date 2021/12/25 23:06
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
