package resignpattern.bulider.demo;

/**
 * @author wxl
 * @version 1.0
 * @description:具体建造者
 * @date 2021/12/24 0:11
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
