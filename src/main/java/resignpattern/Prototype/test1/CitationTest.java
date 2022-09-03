package resignpattern.Prototype.test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/23 22:16
 */
public class CitationTest {
    public static void main(String[] args) throws Exception {
        Citation citation = new Citation();

        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("E:\\IdeaProjects\\ResignPattern_2\\src\\main\\java\\com\\example\\resignpattern_2\\a.txt"));
        os.writeObject(citation);
        os.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("E:\\IdeaProjects\\ResignPattern_2\\src\\main\\java\\com\\example\\resignpattern_2\\a.txt"));
        Citation citation1 = (Citation) is.readObject();
        is.close();
//        citation1.getStudent().setName("李四");
        Student student1 = citation1.getStudent();
        student1.setName("李四");

        citation.show();
        citation1.show();

//        /*
//        citation.setName("张三");
//        citation1.setName("李四");
//         */
//        Citation citation1 = citation.clone();
//        citation1.getStudent().setName("李四");
//
//        citation.show();
//        citation1.show();
//        System.out.println(citation.hashCode() == citation1.hashCode());

    }

}
