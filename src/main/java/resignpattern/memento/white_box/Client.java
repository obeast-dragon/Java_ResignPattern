package resignpattern.memento.white_box;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/26 16:08
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("========大战前======");
        GameRole gameRole = new GameRole();
        gameRole.initState();

        gameRole.stateDisplay();
        //创建管理者备份
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());
        System.out.println("========大战后======");
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("====打不赢重来====");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();


    }
}
