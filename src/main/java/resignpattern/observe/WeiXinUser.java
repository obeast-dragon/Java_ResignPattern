package resignpattern.observe;

/**
 * @author wxl
 * @version 1.0
 * @description:具体观察者
 * @date 2021/12/25 21:38
 */
public class WeiXinUser implements Observer{

    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
