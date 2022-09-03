package resignpattern.iterator;

import java.util.List;

/**
 * @author wxl
 * @version 1.0
 * @description: 具体迭代器实现类
 * @date 2021/12/25 23:38
 */
public class StudentIteratorImpl implements StudentIterator{

    private List<Student> list;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    //用来记录遍历的位置
    private int position = 0;

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student student = list.get(position);
        position++;
        return student;
    }
}
