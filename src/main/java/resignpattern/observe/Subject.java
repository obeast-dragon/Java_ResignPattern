package resignpattern.observe;

/**
 * @author wxl
 * @version 1.0
 * @description: 抽象主题角色
 * @date 2021/12/25 21:37
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notify(String message);
}
