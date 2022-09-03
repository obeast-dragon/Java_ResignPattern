package resignpattern.Prototype.test;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/23 22:16
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();

        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        /*
        citation.setName("张三");
        citation1.setName("李四");
         */
        Citation citation1 = citation.clone();
        citation1.getStudent().setName("李四");

        citation.show();
        citation1.show();
        System.out.println(citation.hashCode() == citation1.hashCode());

    }

}
