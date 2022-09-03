package resignpattern.memento.black_box;



/**
 * @author wxl
 * @version 1.0
 * @description: 备忘录对象管理对象
 * @date 2021/12/26 16:08
 */
public class RoleStateCaretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
