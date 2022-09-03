package resignpattern.facade;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/24 20:55
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("关闭");
    }
}
