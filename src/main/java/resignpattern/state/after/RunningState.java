package resignpattern.state.after;

/**
 * @author wxl
 * @version 1.0
 * @description: 运行状态  具体状态角色
 * @date 2021/12/25 21:00
 */
public class RunningState extends LiftState{
    //运行的时候开电梯门？你疯了！电梯不会给你开的
    @Override
    public void open() {
        System.out.println("现在是运行状态，不可以打开电梯门");
        //do nothing
    }

    //电梯门关闭？这是肯定了
    @Override
    public void close() {//虽然可以关门，但这个动作不归我执行
        System.out.println("现在是运行状态，电梯门已经是关闭的");
        //do nothing
    }

    //这是在运行状态下要实现的方法
    @Override
    public void run() {
        System.out.println("现在是运行状态");
        System.out.println("电梯正在运行...");
    }

    //这个事绝对是合理的，光运行不停止还有谁敢做这个电梯？！估计只有上帝了
    @Override
    public void stop() {
        System.out.println("现在是运行状态，可以停止运行");
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
