package resignpattern.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxl
 * @version 1.0
 * @description: 具体主题角色
 * @date 2021/12/25 21:38
 */
public class SubscriptionSubject implements Subject{

    private List<Observer> weiXinUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weiXinUserList) {
            observer.update(message);
        }
    }
}
