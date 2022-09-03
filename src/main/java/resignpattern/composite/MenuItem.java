package resignpattern.composite;

/**
 * @author wxl
 * @version 1.0
 * @description: 菜单项 叶子节点
 * @date 2021/12/24 23:58
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
