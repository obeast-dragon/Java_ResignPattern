package resignpattern.iterator;

/**
 * @author wxl
 * @version 1.0
 * @description: 抽象聚合对象
 * @date 2021/12/25 23:41
 */
public interface StudentAggrete {

    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
