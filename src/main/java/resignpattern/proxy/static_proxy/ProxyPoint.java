package resignpattern.proxy.static_proxy;

/**
 * @author wxl
 * @version 1.0
 * @description: 代理类  代售点
 * @date 2021/12/24 9:00
 */
public class ProxyPoint implements SellTickets{
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点收取一些服务费");
        trainStation.sell();
    }
}
