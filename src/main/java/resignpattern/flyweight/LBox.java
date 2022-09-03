package resignpattern.flyweight;

/**
 * @author wxl
 * @version 1.0
 * @description:L图形 具体享元角色
 * @date 2021/12/25 0:31
 */
public class LBox extends AbstractBox{
    @Override
    public String getShape() {
        return "L";
    }
}
