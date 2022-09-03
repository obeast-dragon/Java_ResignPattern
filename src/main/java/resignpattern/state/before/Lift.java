package resignpattern.state.before;

/**
 * @author wxl
 * @version 1.0
 * @description:电梯类
 * @date 2021/12/25 20:40
 */
public class Lift implements ILift{

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯打开了");
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了");
                setState(OPENING_STATE);
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                System.out.println("开门状态，电梯门可以关闭...");
                System.out.println("电梯关门了。。。");//只有开门状态可以关闭电梯门，可以对应电梯状态表来看
                this.setState(CLOSING_STATE);//关门之后电梯就是关闭状态了
                break;
            case CLOSING_STATE:
                System.out.println("关门状态，电梯门已经关闭...");
                //do nothing //已经是关门状态，不能关门
                break;
            case RUNNING_STATE:
                System.out.println("运行状态，电梯门已经关闭...");
                //do nothing //运行时电梯门是关着的，不能关门
                break;
            case STOPPING_STATE:
                System.out.println("停止状态，电梯门已经关闭...");
                //do nothing //停止时电梯也是关着的，不能关门
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE://电梯不能开着门就走
                //do nothing
                System.out.println("开门状态，电梯不可以运行...");
                break;
            case CLOSING_STATE://门关了，可以运行了
                System.out.println("关门状态，电梯可以运行...");
                System.out.println("电梯开始运行了。。。");
                this.setState(RUNNING_STATE);//现在是运行状态
                break;
            case RUNNING_STATE:
                System.out.println("运行状态，电梯已经运行了。。。");
                //do nothing 已经是运行状态了
                break;
            case STOPPING_STATE:
                System.out.println("停止状态，电梯可以运行了。。。");
                System.out.println("电梯开始运行了。。。");
                this.setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
                //do nothing
                System.out.println("开门状态，电梯不可以停止。。。");
                break;
            case CLOSING_STATE://关门时才可以停止
                System.out.println("关门状态，电梯可以停止。。。");
                System.out.println("电梯停止了。。。");
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE://运行时当然可以停止了
                System.out.println("运行状态，电梯可以停止。。。");
                System.out.println("电梯停止了。。。");
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("停止状态，电梯已经停止。。。");
                //do nothing
                break;
        }
    }

}
