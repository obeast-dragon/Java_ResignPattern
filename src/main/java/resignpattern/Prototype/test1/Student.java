package resignpattern.Prototype.test1;

import java.io.Serializable;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/23 22:22
 */
public class Student implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
