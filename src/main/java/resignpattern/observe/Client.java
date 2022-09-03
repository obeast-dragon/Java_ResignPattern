package resignpattern.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/25 21:46
 */
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subt = new SubscriptionSubject();
        subt.attach(new WeiXinUser("张三"));
        subt.attach(new WeiXinUser("张二"));
        subt.attach(new WeiXinUser("张4"));
        subt.attach(new WeiXinUser("张5"));

        subt.notify("hello world");
        Observer o;
        Observable op;

    }
}
