package resignpattern.iterator;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/25 23:46
 */
public class Client {
    public static void main(String[] args) {
        StudentAggregateImpl aggregate = new StudentAggregateImpl();
        aggregate.addStudent(new Student("张3","001"));
        aggregate.addStudent(new Student("张4","002"));
        aggregate.addStudent(new Student("张5","003"));
        aggregate.addStudent(new Student("张6","004"));
        aggregate.addStudent(new Student("张7","005"));
        aggregate.addStudent(new Student("张8","006"));

        StudentIterator iterator = aggregate.getStudentIterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next.toString());
        }

    }
}
