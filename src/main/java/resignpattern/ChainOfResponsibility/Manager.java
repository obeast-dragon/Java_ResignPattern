package resignpattern.ChainOfResponsibility;

/**
 * @author wxl
 * @version 1.0
 * @description:部门经理 具体处理者
 * @date 2021/12/25 19:37
 */
public class Manager extends Handler{

    public Manager() {
        super(0,Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + leaveRequest.getContent() + "。");
        System.out.println("经理审批同意：同意");
    }
}
