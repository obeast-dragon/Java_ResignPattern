package resignpattern.ChainOfResponsibility;

/**
 * @author wxl
 * @version 1.0
 * @description:总经理 具体处理者
 * @date 2021/12/25 19:37
 */
public class GeneralManager extends Handler{

    public GeneralManager() {
        super(0,Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + leaveRequest.getContent() + "。");
        System.out.println("总经理审批同意：同意");
    }
}
