package resignpattern.proxy.static_proxy;

/**
 * @author wxl
 * @version 1.0
 * @description:真实主题 火车站
 * @date 2021/12/24 8:59
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
