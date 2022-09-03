package resignpattern.proxy.static_proxy;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/24 9:03
 */
public class Client {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }

}
