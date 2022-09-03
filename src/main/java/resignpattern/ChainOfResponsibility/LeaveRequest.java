package resignpattern.ChainOfResponsibility;

/**
 * @author wxl
 * @version 1.0
 * @description: 请假条类  客户类角色
 * @date 2021/12/25 19:28
 */
public class LeaveRequest {

    private String name;
    private int num;
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
