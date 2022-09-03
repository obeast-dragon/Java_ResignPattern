package resignpattern.bulider.demo;

/**
 * @author wxl
 * @version 1.0
 * @description:执行者
 * @date 2021/12/24 0:14
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //指挥建造
    public Bike construct(){
        builder.buildSeat();
        builder.buildFrame();
        return builder.createBike();
    }
}
