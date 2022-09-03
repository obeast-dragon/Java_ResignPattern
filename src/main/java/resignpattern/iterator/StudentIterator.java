package resignpattern.iterator;

/**
 * @author wxl
 * @version 1.0
 * @description: 抽象迭代器角色接口
 * @date 2021/12/25 23:36
 */
public interface StudentIterator {

    boolean hasNext();

    Student next();
}
