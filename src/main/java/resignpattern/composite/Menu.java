package resignpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxl
 * @version 1.0
 * @description:菜单类 树枝节点
 * @date 2021/12/24 23:29
 */
public class Menu extends MenuComponent{

    private final List<MenuComponent> menuList = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuList.get(index);
    }
/**
 * 功能描述:
 * @Description: 递归打印
 * @Date: 2021/12/25 9:46
 * @Param:
 * @return:
 **/
    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent menuComponent : menuList) {
            menuComponent.print();
        }
    }
}
