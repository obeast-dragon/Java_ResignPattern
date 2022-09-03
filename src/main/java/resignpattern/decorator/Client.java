package resignpattern.decorator;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/24 19:53
 */
public class Client {
    public static void main(String[] args) {
        FastFood fastFood = new FriedNoodles();
        fastFood = new Egg(fastFood);
        fastFood = new Egg(fastFood);
        fastFood = new Bacon(fastFood);
        fastFood = new HamSausage(fastFood);

        System.out.println(fastFood.getDesc()+fastFood.cost());
    }

}
