package resignpattern.ChainOfResponsibility;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/25 19:46
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leave = new LeaveRequest("张三", 2,"累");

        //责任链
        GroupLeader leader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        leader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        leader.submit(leave);
    }
}
