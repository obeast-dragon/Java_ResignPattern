package resignpattern.bulider.demo;

/**
 * @author wxl
 * @version 1.0
 * @description:抽象建造者
 * @date 2021/12/24 0:04
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
