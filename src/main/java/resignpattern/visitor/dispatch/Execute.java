package resignpattern.visitor.dispatch;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/26 14:56
 */
/*
class Test {
    void hello(){
        System.out.println("爸");
    }
}
class Testkid extends Test{
    void hello(){
        System.out.println("大儿子");
    }
}
class Testkid2 extends Test{
    void hello(){
        System.out.println("二儿子");
    }
}
class clienttest{
    public static void main(String[] args) {
        Test test = new Test();
        test.hello();

        Test test1 = new Testkid();
        test1.hello();

        Test test2 = new Testkid2();
        test2.hello();

    }
}
*/
    /*
class Animal{

}
class Dog extends Animal{

}
class Cat extends Animal{

}
public class Execute {
    void hello(Dog dog){
        System.out.println("二儿子");
    }
    void hello(Cat cat){
        System.out.println("1儿子");
    }
    void hello(Animal animal){
        System.out.println("2儿子");
    }

}
class clienttest{
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal animal = new Cat();
        Animal animal1 = new Dog();

        Execute execute = new Execute();
        execute.hello(a);
        execute.hello(animal);
        execute.hello(animal1);

    }
}

     */
class Animal{
    void accept(Execute execute){
        execute.hello(this);
    }
}
class Dog extends Animal{
    void accept(Execute execute){
        execute.hello(this);
    }
}
class Cat extends Animal{
    void accept(Execute execute){
        execute.hello(this);
    }
}
public class Execute {
    void hello(Dog dog){
        System.out.println("二儿子");
    }
    void hello(Cat cat){
        System.out.println("1儿子");
    }
    void hello(Animal animal){
        System.out.println("2儿子");
    }
}
class clienttest{
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal c = new Cat();
        Animal d = new Dog();
        Execute execute = new Execute();
        d.accept(execute);
        a.accept(execute);
        c.accept(execute);

    }
}