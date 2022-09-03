package resignpattern.ChainOfResponsibility;

/**
 * @author wxl
 * @version 1.0
 * @description:小组长 具体处理者
 * @date 2021/12/25 19:37
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        super(0,Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + leaveRequest.getContent() + "。");
        System.out.println("小组长审批同意：同意");
    }
}
