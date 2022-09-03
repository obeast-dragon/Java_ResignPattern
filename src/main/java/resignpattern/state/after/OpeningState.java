package resignpattern.state.after;

/**
 * @author wxl
 * @version 1.0
 * @description: 开启状态  具体状态角色
 * @date 2021/12/25 21:00
 */
public class OpeningState extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯开启。。。");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();

    }

    @Override
    public void run() {
        //do noting
    }

    @Override
    public void stop() {
        //do noting
    }
}
