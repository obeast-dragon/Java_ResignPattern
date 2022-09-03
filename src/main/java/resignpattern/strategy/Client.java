package resignpattern.strategy;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/25 13:45
 */
public class Client {
    public static void main(String[] args) {
        SalesMan man = new SalesMan(new StrategyA());
        man.salesManShow();

        SalesMan man1 = new SalesMan(new StrategyC());
        man1.salesManShow();

    }
}
