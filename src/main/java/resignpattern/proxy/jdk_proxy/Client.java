package resignpattern.proxy.jdk_proxy;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/24 10:11
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
        System.out.println(proxyObject.getClass());
    }
}
