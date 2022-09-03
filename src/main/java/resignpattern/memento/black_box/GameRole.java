package resignpattern.memento.black_box;


/**
 * @author wxl
 * @version 1.0
 * @description: 游戏角色 发起人角色
 * @date 2021/12/26 15:57
 */
public class GameRole {

    private int hp;

    private int atk;

    private int def;

    public void initState(){
        this.hp = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight(){
        this.hp = 0;
        this.atk = 0;
        this.def = 0;
    }

    public RoleStateMemento saveState() {
        return new RoleStateMemento(this.hp,this.atk,this.def);
    }

    public void recoverState(Memento memento){
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        this.hp = roleStateMemento.getHp();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    public void stateDisplay() {
        System.out.println("hp" + hp);
        System.out.println("atk" + atk);
        System.out.println("def" + def);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }


    //备忘录角色
    private class RoleStateMemento implements Memento{
        private int hp;

        private int atk;

        private int def;

        public RoleStateMemento() {
        }

        public RoleStateMemento(int hp, int atk, int def) {
            this.hp = hp;
            this.atk = atk;
            this.def = def;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }
    }
}
