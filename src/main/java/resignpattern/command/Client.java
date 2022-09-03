package resignpattern.command;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/25 16:52
 */
public class Client {

    public static void main(String[] args) {
        Order o1 = new Order();
        o1.setDiningTable(1);
        o1.setFood("战斧牛排",1);
        o1.setFood("快乐水",1);
        Order o2 = new Order();
        o2.setDiningTable(2);
        o2.setFood("爆炒牛排",2);
        o2.setFood("柠檬水",2);

        SeniorChef chef = new SeniorChef();
        OrderCommand command = new OrderCommand(o1,chef);
        OrderCommand command2 = new OrderCommand(o2,chef);

        Waitor waitor = new Waitor();
        waitor.setCommand(command);
        waitor.setCommand(command2);
        waitor.orderUp();

    }


}
