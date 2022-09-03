package resignpattern.command;

/**
 * @author wxl
 * @version 1.0
 * @description: 厨师类 接收者（receiver）对象
 * @date 2021/12/25 16:30
 */
public class SeniorChef {

    public void makeFood(String name, int num){
        System.out.println(num + "份" + name);
    }
}
