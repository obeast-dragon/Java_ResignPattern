package resignpattern.Mendiator;

/**
 * @author wxl
 * @version 1.0
 * @description: 具体同事类
 * @date 2021/12/25 23:07
 */
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message){
        mediator.constact(message,this);
    }

    public void getMessage(String message){
        System.out.println("租房者" + name + "获取到的信息是：" + message);
    }
}
