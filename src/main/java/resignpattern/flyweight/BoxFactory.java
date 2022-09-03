package resignpattern.flyweight;

import java.util.HashMap;

/**
 * @author wxl
 * @version 1.0
 * @description: 享元工厂类 设计为单例
 * @date 2021/12/25 0:34
 */
public class BoxFactory {
    private HashMap<String, AbstractBox> map;

    private static BoxFactory boxFactory = new BoxFactory();

    private BoxFactory(){
        map = new HashMap<>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }

    public static BoxFactory getInstance(){
        return boxFactory;

    }

    public AbstractBox getShape(String name){
        return map.get(name);
    }
}
