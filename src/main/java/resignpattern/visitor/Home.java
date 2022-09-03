package resignpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxl
 * @version 1.0
 * @description: 对象结构角色
 * @date 2021/12/26 14:38
 */
public class Home {

    private List<Animal> listAnimal = new ArrayList<>();

    public void add(Animal animal){
        listAnimal.add(animal);
    }
    public void action(Person person){
        for (Animal animal : listAnimal) {
            animal.accept(person);
        }
    }
}
