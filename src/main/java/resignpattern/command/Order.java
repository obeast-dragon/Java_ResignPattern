package resignpattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wxl
 * @version 1.0
 * @description: 订单类
 * @date 2021/12/25 16:23
 */
public class Order {

    private int diningTable;

    private Map<String,Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFood() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        foodDir.put(name,num);
    }
}
