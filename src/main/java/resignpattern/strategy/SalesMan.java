package resignpattern.strategy;

/**
 * @author wxl
 * @version 1.0
 * @description: 环境类 销售员
 * @date 2021/12/25 13:43
 */
public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesManShow(){
        strategy.show();
    }
}
