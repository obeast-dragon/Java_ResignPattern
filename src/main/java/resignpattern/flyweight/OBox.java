package resignpattern.flyweight;

/**
 * @author wxl
 * @version 1.0
 * @description:O图形 具体享元角色
 * @date 2021/12/25 0:31
 */
public class OBox extends AbstractBox{
    @Override
    public String getShape() {
        return "O";
    }
}
