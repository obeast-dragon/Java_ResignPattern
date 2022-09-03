package resignpattern.visitor;

/**
 * @author wxl
 * @version 1.0
 * @description: 抽象元素类 动物
 * @date 2021/12/26 14:31
 */
public interface Animal {

    void accept(Person person);
}
