package resignpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxl
 * @version 1.0
 * @description: 服务员类 请求者（invoker）角色
 * @date 2021/12/25 16:46
 */
public class Waitor {

    private List<Command> commandList = new ArrayList<>();

    public void setCommand(Command command) {
        commandList.add(command);
    }

    public void orderUp(){
        System.out.println("来订单了！！！");
        for (Command command : commandList) {
            if (null != command){
                command.execute();
            }
        }
    }

}
