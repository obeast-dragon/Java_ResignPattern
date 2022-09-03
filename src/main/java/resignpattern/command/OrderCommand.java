package resignpattern.command;

import java.util.Map;
import java.util.Set;

/**
 * @author wxl
 * @version 1.0
 * @description: 具体命令类
 * @date 2021/12/25 16:34
 */
public class OrderCommand implements Command{

    private Order order;
    private SeniorChef seniorChef;

    public OrderCommand(Order order, SeniorChef seniorChef) {
        this.order = order;
        this.seniorChef = seniorChef;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");
        Map<String, Integer> food = order.getFood();

        Set<String> keySet = food.keySet();
        for (String foodName : keySet){
            seniorChef.makeFood(foodName,food.get(foodName));
        }
        System.out.println(order.getDiningTable() + "桌的饭准备完毕 ！！！");
    }
}
