package resignpattern.memento.white_box;

/**
 * @author wxl
 * @version 1.0
 * @description: 备忘录对象管理对象
 * @date 2021/12/26 16:08
 */
public class RoleStateCaretaker {

    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
