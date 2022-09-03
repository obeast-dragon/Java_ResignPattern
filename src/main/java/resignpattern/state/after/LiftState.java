package resignpattern.state.after;

/**
 * @author wxl
 * @version 1.0
 * @description: 抽象状态类
 * @date 2021/12/25 20:57
 */
public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
