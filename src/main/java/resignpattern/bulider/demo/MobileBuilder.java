package resignpattern.bulider.demo;

/**
 * @author wxl
 * @version 1.0
 * @description:具体建造者
 * @date 2021/12/24 0:09
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
