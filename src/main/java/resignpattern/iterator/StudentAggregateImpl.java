package resignpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxl
 * @version 1.0
 * @description: 具体聚合类
 * @date 2021/12/25 23:42
 */
public class StudentAggregateImpl implements StudentAggrete{

    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
