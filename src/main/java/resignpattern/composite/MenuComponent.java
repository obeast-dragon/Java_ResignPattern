package resignpattern.composite;

/**
 * @author wxl
 * @version 1.0
 * @description: 菜单组件 抽象根节点
 * @date 2021/12/24 23:29
 */
public abstract class MenuComponent {
    protected String name;
    protected int level;

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();

    }

    public String getName(){
        return name;
    }

    public abstract void print();

}
