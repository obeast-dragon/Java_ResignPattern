package resignpattern.Factory.config_factory;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("latte");
        coffee.addmilk();
        coffee.addsugar();
        System.out.println(coffee.getName());
        System.out.println("===================================");
        Coffee coffee1 = CoffeeFactory.createCoffee("american");
        coffee1.addsugar();
        coffee1.addsugar();
        coffee1.addsugar();
        System.out.println(coffee1.getName());


    }
}
