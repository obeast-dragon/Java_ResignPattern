package resignpattern.state.after;

/**
 * @author wxl
 * @version 1.0
 * @description: 停止状态  具体状态角色
 * @date 2021/12/25 21:00
 */
public class StoppingState extends LiftState{
    //停止状态，开门，那是要的！
    @Override
    public void open() {
        System.out.println("现在是停止状态，可以打开电梯门");
        //状态修改
        super.context.setLiftState(Context.OPENING_STATE);
        //动作委托为CloseState来执行，也就是委托给了ClosingState子类执行这个动作
        super.context.getLiftState().open();
    }

    @Override
    public void close() {//虽然可以关门，但这个动作不归我执行
        System.out.println("现在是停止状态，电梯门已经是关闭的");
        //状态修改
        super.context.setLiftState(Context.CLOSING_STATE);
        //动作委托为CloseState来执行，也就是委托给了ClosingState子类执行这个动作
        super.context.getLiftState().close();
    }

    //停止状态再跑起来，正常的很
    @Override
    public void run() {
        System.out.println("现在是停止状态，可以运行电梯");
        //状态修改
        super.context.setLiftState(Context.RUNNING_STATE);
        //动作委托为CloseState来执行，也就是委托给了ClosingState子类执行这个动作
        super.context.getLiftState().run();
    }

    //停止状态是怎么发生的呢？当然是停止方法执行了
    @Override
    public void stop() {
        System.out.println("现在是停止状态");
        System.out.println("电梯停止了...");
    }
}
