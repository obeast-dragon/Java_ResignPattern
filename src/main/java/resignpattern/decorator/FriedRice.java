package resignpattern.decorator;

/**
 * @author wxl
 * @version 1.0
 * @description: 炒面 具体构件（Concrete Component）角色
 * @date 2021/12/24 19:45
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(11,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
