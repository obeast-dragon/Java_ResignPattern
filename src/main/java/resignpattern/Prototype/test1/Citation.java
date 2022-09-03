 package resignpattern.Prototype.test1;

 import java.io.Serializable;

 /**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/23 22:13
 */
public class Citation implements Cloneable, Serializable {
    /*
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     */

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show(){
        System.out.println(student.getName() + "好秀娥");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
