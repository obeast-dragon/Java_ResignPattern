package resignpattern.strategy;

/**
 * @author wxl
 * @version 1.0
 * @description: 具体策略类A
 * @date 2021/12/25 13:41
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("strategyA");
    }
}
