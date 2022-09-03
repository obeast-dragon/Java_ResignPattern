package resignpattern.ChainOfResponsibility;

/**
 * @author wxl
 * @version 1.0
 * @description: 抽象处理者类
 * @date 2021/12/25 19:29
 */
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    private int numStart;
    private int numEnd;

    //声明后继者
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //设置上级领导
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    protected abstract void handleLeave(LeaveRequest leaveRequest);

    public final void submit(LeaveRequest leaveRequest){
        this.handleLeave(leaveRequest);
        if (this.nextHandler != null && leaveRequest.getNum() > this.numEnd){
            this.nextHandler.submit(leaveRequest);
        }else {
            System.out.println("流程结束!");
        }
    }


}
