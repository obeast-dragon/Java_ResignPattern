package resignpattern.flyweight;

/**
 * @author wxl
 * @version 1.0
 * @description:I图形 具体享元角色
 * @date 2021/12/25 0:31
 */
public class IBox extends AbstractBox{
    @Override
    public String getShape() {
        return "I";
    }
}
