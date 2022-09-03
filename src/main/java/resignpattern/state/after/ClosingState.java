package resignpattern.state.after;

/**
 * @author wxl
 * @version 1.0
 * @description: 关闭状态  具体状态角色
 * @date 2021/12/25 21:00
 */
public class ClosingState extends LiftState{
    @Override
    //电梯门关闭，这是关闭状态要实现的动作
    public void close() {
        System.out.println("现在是电梯门关闭状态");
        System.out.println("电梯门关闭...");
    }

    //电梯门关了再打开，逗你玩呢，那这个允许呀
    @Override
    public void open() {
        System.out.println("现在是电梯门关闭状态，电梯门可以打开");
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }


    //电梯门关了就跑，这是再正常不过了
    @Override
    public void run() {
        System.out.println("现在是电梯门关闭状态，电梯门可以运行");
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    //电梯门关着，我就不按楼层
    @Override
    public void stop() {
        System.out.println("现在是电梯门关闭状态，电梯门可以停止");
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
