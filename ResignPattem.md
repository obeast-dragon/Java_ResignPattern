# 一.七大原则

## 1.迪米特法则

### **1.1	定义：**

​	如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方转发该调用

即：**降低类之间的耦合度，提高模块的相对独立性**（典型应用：外观原则）

### 1.2	**优点：**

1. **降低了类之间的耦合度，提高了模块的相对独立性。**
2. 由于亲合度降低，从而提高了类的可复用率和系统的扩展性。

### 1.3  **缺点：**

​	过度使用迪米特法则会使系统**产生大量的中介类，从而增加系统的复杂性**，使模块之间的通信效率降低.



## 2.开闭原则

### **2.1	定义：**

​	软件实体应当对**扩展开放，对修改关闭**（Software entities should be open for extension，but closed for modification）。

2.优点：

​	1.粒度越小，被复用的可能性就越大；在面向对象的程序设计中，根据原子和抽象编程可以提高代码的**可复用性**。

​	2.遵守开闭原则的软件，其稳定性高和延续性强，从而**易于扩展和维护**。

## 3.依赖倒置原则

### 3.1	定义：

​		**高层模块不应该依赖低层模块，两者都应该依赖其抽象**；抽象不应该依赖细节，细节应该依赖抽象。即面向接口编程，不要面向实现编程

### 3.2	主要作用

- 依赖倒置原则可以降低类间的耦合性。
- 依赖倒置原则可以提高系统的稳定性。
- 依赖倒置原则可以减少并行开发引起的风险。
- 依赖倒置原则可以提高代码的可读性和可维护性。



## 4.接口隔离原则

### 4.1	定义：

​		要为**各个类建立它们需要的专用接口**，而不**要试图去建立一个很庞大的接口**供所有依赖它的类去调用

### 4.2	主要作用：

1. 将臃肿庞大的接口分解为多个粒度小的接口，可以预防外来变更的扩散，提高系统的灵活性和可维护性。
2. 接口隔离提高了系统的内聚性，减少了对外交互，降低了系统的耦合性。
3. 如果接口的粒度大小定义合理，能够保证系统的稳定性；但是，如果定义过小，则会造成接口数量过多，使设计复杂化；如果定义太大，灵活性降低，无法提供定制服务，给整体项目带来无法预料的风险。
4. 使用多个专门的接口还能够体现对象的层次，因为可以通过接口的继承，实现对总接口的定义。
5. 能减少项目工程中的代码冗余。过大的大接口里面通常放置许多不用的方法，当实现这个接口的时候，被迫设计冗余的代码。

## 5.合成复用原则

### 5.1	定义

​		它要求在软件复用时，要尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现。



**通常类的复用分为继承复用和合成复用两种，继承复用虽然有简单和易实现的优点，但它也存在以下缺点。**

1. 继承复用破坏了类的封装性。因为继承会将父类的实现细节暴露给子类，父类对子类是透明的，所以这种复用又称为“白箱”复用。
2. 子类与父类的耦合度高。父类的实现的任何改变都会导致子类的实现发生变化，这不利于类的扩展与维护。
3. 它限制了复用的灵活性。从父类继承而来的实现是静态的，在编译时已经定义，所以在运行时不可能发生变化。



### 5.2	主要作用：

1. 它维持了类的封装性。因为成分对象的内部细节是新对象看不见的，所以这种复用又称为“黑箱”复用。
2. 新旧类之间的耦合度低。这种复用所需的依赖较少，新对象存取成分对象的唯一方法是通过成分对象的接口。
3. 复用的灵活性高。这种复用可以在运行时动态进行，新对象可以动态地引用与成分对象类型相同的对象。

​	

## 6.里氏替换原则

### 6.1	定义：

​	继承必须确保基类所拥有的性质在子类中仍然成立。即子类可以扩展父类的功能，但不能改变父类原有的功能。

### 6.2	主要作用：

1. 里氏替换原则是实现开闭原则的重要方式之一。
2. 它克服了继承中重写父类造成的可复用性变差的缺点。
3. 它是动作正确性的保证。即类的扩展不会给已有的系统引入新的错误，降低了代码出错的可能性。
4. 加强程序的健壮性，同时变更时可以做到非常好的兼容性，提高程序的维护性、可扩展性，降低需求变更时引入的风险。

## 7.单一职责原则

### 7.1	定义：

​		规定**一个类应该有且仅有一个引起它变化的原因**，否则类应该被拆分。即对象不应该承担太多职责

### 7.2	主要作用：

- 降低类的复杂度。一个类只负责一项职责，其逻辑肯定要比负责多项职责简单得多。
- 提高类的可读性。复杂性降低，自然其可读性会提高。
- 提高系统的可维护性。可读性提高，那自然更容易维护了。
- 变更引起的风险降低。变更是必然的，如果单一职责原则遵守得好，当修改一个功能时，可以显著降低对其他
- 功能的影响。

## 总结

| 设计原则     | 一句话归纳                                                   | 目的                                       |
| ------------ | ------------------------------------------------------------ | ------------------------------------------ |
| 开闭原则     | 对扩展开放，对修改关闭                                       | 降低维护带来的新风险                       |
| 依赖倒置原则 | 高层不应该依赖低层，要面向接口编程.即**依赖抽象，不依赖具体** | 更利于代码结构的升级扩展                   |
| 单一职责原则 | 一个类只干一件事，实现类要单一                               | 便于理解，提高代码的可读性                 |
| 接口隔离原则 | 一个接口只干一件事，接口要精简单一                           | 功能解耦，高聚合、低耦合                   |
| 迪米特法则   | **不该知道的不要知道**，一个类应该保持对其它对象最少的了解，**降低耦合度** | 只和朋友交流，不和陌生人说话，减少代码臃肿 |
| 里氏替换原则 | 不要破坏继承体系，子类重写方法功能发生改变，不应该影响父类方法的含义 | 防止继承泛滥                               |
| 合成复用原则 | 尽量使用组合或者聚合关系实现代码复用，少使用继承             | 降低代码耦合                               |



实际上，这些原则的目的只有一个：降低对象之间的耦合，增加程序的可复用性、可扩展性和可维护性。

> 记忆口诀：访问加限制，函数要节俭，依赖不允许，动态加接口，父类要抽象，扩展不更改





# 二.创建者模式

## 1.单例模式 Singleton

### 1.1饿汉式（可用）

强制加载实例

```java
public class Mg01 {
    private static final Mg01 INSTANCE = new Mg01();

    private Mg01() {
    }

    public static Mg01 getInstance(){
        return INSTANCE;
    }
}

```

### 1.2	静态代码块饿汉式（可用强制加载实例）

```java
public class Mg02 {
    private static final Mg02 INSTANCE;
    static {
        INSTANCE = new Mg02();
    }

    private Mg02() {
    }

    public  static Mg02 getInstance(){
        return INSTANCE;
    }
}
```

### 1.3	懒汉式（线程不安全）

```java
public class Mg03 {
    private static  Mg03 INSTANCE;

    private Mg03() {
    }


    public static Mg03 getInstance() throws Exception{
        if (INSTANCE == null){
            Thread.sleep(500);
            INSTANCE =  new Mg03();
        }
        return INSTANCE;
    }
}
```

### 1.4	方法上加锁懒汉式（可用速度慢）

```java
public class Mg04 {
    private static Mg04 INSTANCE;

    private  Mg04() {
    }


    public static synchronized Mg04 getInstance() throws Exception{
        if (INSTANCE == null){
            Thread.sleep(500);
            INSTANCE =  new Mg04();
        }
        return INSTANCE;
    }
    }
```

### 1.5	判断内加锁懒汉式（线程不安全）

即尝试减小同步代码块

```java
public class Mg04 {
    private static Mg04 INSTANCE;

    private  Mg04() {
    }


   public static Mg05 getInstance() throws Exception{
        if (INSTANCE == null){
            //妄想通过减少同步代码块的方式提高效率，不可行
            synchronized (Mg05.class){
                Thread.sleep(50);
                INSTANCE =  new Mg05();
            }
        }
        return INSTANCE;
    }
}
```

### 1.6	双重检测（必须在静态对象加上volatile防止JIT重排序）可用

```java
public class Mg06 {
    private static volatile Mg06 INSTANCE;//指定重排问题 JIT

    private Mg06() {
    }


    public static Mg06 getInstance() throws Exception{
        if (INSTANCE == null){
            //妄想通过减少同步代码块的方式提高效率，不可行
            synchronized (Mg06.class){
                if (INSTANCE == null){
                    Thread.sleep(50);
                    INSTANCE =  new Mg06();
                    /*字节码层
                    JIT即时编译
                    1.分配空间
                    2.初始化
                    3.引用赋值
                    2.3可以交换
                    加上volatile防止重新排序
                    */
                }
            }
        }
        return INSTANCE;
    }
    }
```

### 1.7	静态内部类（可用）

```java
public class Mg07 {

    private static class Mg07Holder{
        private static final Mg07 INSTANCE = new Mg07();
    }

    private Mg07() {
    }

    public static Mg07 getInstance(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Mg07Holder.INSTANCE;
    }
    }
```

### 1.8	枚举（可用） 

**没有构造方法安全还能防止被反序列化**

```java
public  enum Mg08 {

    //之所以不能反序化是因为：枚举类没有构造方法
    //反编译之后是.abstractClass
    INSTANCE;

    public void M() {}
    }
```

源码应用

//Spring& JDK
1.java.lang.Runtime
2.org.springframework.aop.framework.ProxyFactoryBean

3.org.springframework.beans.factory.support.DefaultSingletonBeanRegistry

4.org.springframework.core.ReactiveAdapterRegistry

//Tomcat

5.org.apache.catalina.webresources.TomcatURLStreamHanderFactory

//反序列化指定数据源

6.java.util.Currency



## 2.工厂模式 Factory

### 2.1简单工厂模式

#### 2.1.1	结构

简单工厂包含如下角色：

- **抽象产品** ：定义了产品的规范，描述了产品的主要特性和功能。

- **具体产品** ：实现或者继承抽象产品的子类

- **具体工厂** ：提供了创建产品的方法，调用者通过该方法来获取产品。

![image-20211223200308344](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211223200308344.png)

#### 2.1.2	优缺点

**优点：**

封装了创建对象的过程，可以通过参数直接获取对象。把对象的创建和业务逻辑层分开，这样以后就避免了修改客户代码，如果要实现新产品直接修改工厂类，而不需要在原代码中修改，这样就降低了客户代码修改的可能性，更加容易扩展。

**缺点：**

增加新产品时还是需要修改工厂类的代码，**违背了“开闭原则”**

#### 2.1.3	静态工厂模式

```java
public static Coffee createCoffee(String type) {
        //声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }

        return coffee;
    }
```



### 2.2工厂方法模式

#### 2.2.1	概念

​		定义一个用于创建对象的接口，让子类决定实例化哪个产品类对象。工厂方法使一个产品类的实例化延迟到其工厂的子类。



#### 2.2.2	结构

工厂方法模式的主要角色：

- **抽象工厂（Abstract Factory）**：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法来创建产品。

- **具体工厂（ConcreteFactory）**：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。

- **抽象产品（Product）**：定义了产品的规范，描述了产品的主要特性和功能。

- **具体产品（ConcreteProduct）**：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。



![image-20211223200258508](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211223200258508.png)

#### 2.2.3	优缺点

**优点：**

·    用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程；

·    在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则；

**缺点：**

·    每增加一个产品就要增加一个**具体产品类**和一个对应的具体工厂类，这增加了系统的复杂度。

### 2.3	抽象工厂模式

#### 2.3.1	概念

​		是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。

抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。



#### 2.3.2	结构

抽象工厂模式的主要角色如下：

- **抽象工厂（Abstract Factory）**：提供了创建产品的接口，它包含多个创建产品的方法，可以创建多个不同等级的产品。

- **具体工厂（Concrete Factory）**：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。

- **抽象产品（Product）**：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。

-  **具体产品（ConcreteProduct）**：实现了抽象产品角色所定义的接口，由具体工厂来创建，它 同具体工厂之间是多对一的关系。



![image-20211223200839734](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211223200839734.png)

#### 2.3.3   优缺点

**优点：**

当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。

**缺点：**

当产品族中需要增加一个**新的产品**时，所有的工厂类都需要进行修改。

#### 2.3.4	使用场景

- 当需要创建的对象是一系列相互关联或相互依赖的产品族时，如电器工厂中的电视机、洗衣机、空调等。

- 系统中有多个产品族，但每次只使用其中的某一族产品。如有人只喜欢穿某一个品牌的衣服和鞋。

- 系统中提供了产品的类库，且所有产品的接口相同，客户端**不依赖产品实例的创建细节和内部结构**。



### 2.4	模式扩展----简单工厂+配置文件 

#### 2.4.1	使用场景



### 2.5	JDK源码解析-Collection.iterator

![image-20211223211923118](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211223211923118.png)



Collection接口是抽象工厂类，ArrayList是具体的工厂类; Iterator接口是抽象商品类，arTavyList类中的Iteat内部类是具体的商品类。在具体的工厂类中iterator()方法创建具体的商品类的对象。
另:
1,DateForamt类中的getInstance()方法使用的是工厂模式;

2 , calendar类中的gstInstance ()方法使用的是工厂模式;

## 3.原型模式 Prototype

### 3.1定义：

​		用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型对象相同的新对象。

### 3.2 结构：

原型模式包含如下角色：

-  **抽象原型类：**规定了具体原型对象必须实现的的 clone() 方法。

Cloneable接口

-  **具体原型类**：实现抽象原型类的 clone() 方法，它是可被复制的对象。

​       要克隆的类要实现Cloneable

- **访问类**：使用具体原型类中的 clone() 方法来复制新的对象。

![image-20211223213506915](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211223213506915.png)

### 3.3实现 ：

**原型模式的克隆分为浅克隆和深克隆**

- **浅克隆：**创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，**仍指向原有属性所指向的对象的内存地址**。

- **深克隆：**创建一个新对象，属性中引用的其他对象也会被克隆，**不再指向原有对象地址**

  Java中的object类中提供了	clone()方法来实现浅克隆。Cloneable 接口是上面的类图中的抽象原型类，而实现了cloneable接口的子实现类就是具体的原型类。代码如下:  

  

### 3.4**使用场景**:

- 对象的创建非常复杂，可以使用原型模式快捷的创建对象。

- 性能和安全要求比较高。



### 3.5 深克隆

**注意：**Citation类和Student类必须实现Serializable接口，否则会抛NotSerializableException异常。



```java
 public static void main(String[] args) throws Exception {
        Citation citation = new Citation();

        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("E:\\DesignPattern\\src\\a.txt"));
        os.writeObject(citation);
        os.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("E:\\DesignPattern\\src\\a.txt"));
        Citation citation1 = (Citation) is.readObject();
        is.close();
//        citation1.getStudent().setName("李四");
        Student student1 = citation1.getStudent();
        student1.setName("李四");

        citation.show();
        citation1.show();
}
```



## 4.建造者模式 Bulider

### 4.1 定义：

将一个复杂对象的构建与表示分离，使得同样的构建过程可以创建不同的表示。

### 4.2 结构

**1.抽象建造者类（Builder）**：包含创建产品各个子部件的抽象方法的接口，通常还包一个返回复杂产品的方法 getResult（）。此类并不涉及具体的部件对象的创建。

**2.具体建造者类（ConcreteBuilder）**：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。在构造过程完成后，提供产品的实例。

**3.产品类（Product）**：要创建的复杂对象。包含多个组成部件的复杂对象，由具体建造者来创建其各个组成部件。

**4.指挥者类（Director）**：调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。

![image-20211223235217998](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211223235217998.png)

![image-20211226222530979](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211226222530979.png)

### 4.3 优缺点

**主要优点**。 

①各个具体的建造者相互独立，有利于系统的扩展。

②客户端不必知道产品内部组成的细节，便于控制细节风险。

**缺点**如下。 

①产品的组成部分必须相同，这限制了其使用范围。

②如果产品的内部变化复杂，该模式会增加很多的建造者类。



### 4.3 使用场景

​		建造者（Builder）模式创建的是复杂对象，其产品的各个部分经常面临着剧烈的变化，但将它们组合在一起的算法却相对稳定，所以它通常在以下场合使用。

- 创建的对象较复杂，由多个部件构成，各部件面临着复杂的变化，但构件间的建造顺序是稳定的。

- **创建复杂对象的算法独立于该对象的组成部分以及它们的装配方式**，即产品的构建过程和最终的表示是独立的。

### 4.4模式扩展

​		建造者模式除了上面的用途外，在开发中还有一个常用的使用方式，就是当一个类构造器需要传入很多参数时，如果创建这个类的实例，代码可读性会非常差，而且很容易引入错误，此时就可以利用建造者模式进行重构。(单例模式中的静态内部类的方法)

```java
public class Phone {

    private String CPU;
    private String screen;
    private String memory;
    private String mainBoard;

    private Phone(Builder builder){
        this.CPU = builder.CPU;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "CPU='" + CPU + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }

    public static final class Builder{
        private String CPU;
        private String screen;
        private String memory;
        private String mainBoard;

        public Builder() {
        }

        public Builder cpu(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder mainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }
}
```



## 5.创建者模式对比

### 5.1 工厂方法模式VS建造者模式

工厂方法模式注重的是整体对象的创建方式;而建造者模式注重的是部件构建的过程，意在通过一步一步地精确构造创建出一个复杂的对象。
我们举个简单例子来说明两者的差异，如要制造一个超人，如果使用工厂方法模式，直接产生出来的就是一个力大无穷、能够飞翔、内裤外穿的超人;而如果使用建造者模式，则需要组装手、头、脚、躯干等部分，然后再把内裤外穿,于是一个超人就诞生了。



### 5.2抽象工厂模式VS建造者模式

抽象工厂模式实现对产品家族的创建，一个产品家族是这样的一系列产品:具有不同分类维度的产品组合，采用抽象工厂模式则是不需要关心构建过程，只关心什么产品由什么工厂生产即可。
建造者模式则是要求按照指定的蓝图建造产品，它的主要目的是通过组装零配件而产生一个新产品。
如果将抽象工厂模式看成汽车配件生产工厂，生产一个产品族的产品，那么建造者模式就是一个汽车组装工厂，通过对部件的组装可以返回一辆完整的汽车。



# 三.结构型模式

结构型模式描述如何将类或对象按某种布局组成更大的结构。它分为**类结构型模式**和**对象结构型模式**，**前者采用继承机制来组织接口和类**，**后者釆用组合或聚合来组合对象**。

由于**组合关系或聚合关系比继承关系耦合度低**，**满足“合成复用原则**”，所以对象结构型模式比类结构型模式具有更大的灵活性。

结构型模式分为以下 7 种：

1. 代理（Proxy）模式：为某对象提供一种代理以控制对该对象的访问。即客户端通过代理间接地访问该对象，从而限制、增强或修改该对象的一些特性。
2. 适配器（Adapter）模式：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
3. 桥接（Bridge）模式：将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现的，从而降低了抽象和实现这两个可变维度的耦合度。
4. 装饰（Decorator）模式：动态地给对象增加一些职责，即增加其额外的功能。
5. 外观（Facade）模式：为多个复杂的子系统提供一个一致的接口，使这些子系统更加容易被访问。
6. 享元（Flyweight）模式：运用共享技术来有效地支持大量细粒度对象的复用。
7. 组合（Composite）模式：将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性。


以上 7 种结构型模式，除了[适配器模式](http://c.biancheng.net/view/1361.html)分为类结构型模式和对象结构型模式两种，其他的全部属于对象结构型模式，下面我们会分别、详细地介绍它们的特点、结构与应用。

## 1.代理模式 Proxy

### 1.1 定义

​		由于某些原因需要给某对象**提供一个代理以控制对该对象的访问**。这时，访问对象不适合或者**不能直接引用目标对象**，**代理对象作为**访问对象和目标对象之间的**中介**。

​		Java中的代理按照代理类生成时机不同又分为**静态代理**和**动态代理**。**静态代理代理类在编译期就生成**，而**动态代理代理类则是在Java运行时动态生成**。动态代理又有JDK代理和CGLib代理两种。

### 1.2 结构

**1抽象主题（Subject）类**： 通过接口或抽象类声明真实主题和代理对象实现的业务方法。

**2真实主题（Real Subject）类**： 实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。

**3代理（Proxy）类** ： 提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。

### 1.3 **静态代理**

**火车站卖票**

如果要买火车票的话，需要去火车站买票，坐车到火车站，排队等一系列的操作，显然比较麻烦。而火车站在多个地方都有代售点，我们去代售点买票就方便很多了。这个例子其实就是典型的代理模式，火车站是目标对象，代售点是代理对象。类图如下：

**![`image-20211224085537486`](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224085537486.png)**

从上面代码中可以看出测试类直接访问的是ProxyPoint类对象，也就是说ProxyPoint作为访问对象和目标对象的中介。同时也对sell方法进行了增强（代理点收取一些服务费用)。



### 1.4 JDK动态代理（接口动态代理）

接下来我们使用动态代理实现上面案例，先说说口JDK提供的动态代理。Java中提供了一个动态代理类Proxy，Proxy并不是我们上述所说的代理对象的类，而是提供了一个创建代理对象的静态方法(newProxyInstance方法）来获取代理对象。

```java
/**
 * @author wxl
 * @version 1.0
 * @description: 获取代理对象的工厂类 生产代理中介
 *      代理类也实现了对应的接口
 * @date 2021/12/24 10:03
 */
public class ProxyFactory {
    private TrainStation station = new TrainStation();

    /*
    public static Object newProxyInstance(ClassLoader loader, 类加载器，用于加载代理类，通过目标对象获取获取类加载器
                                          Class<?>[] interfaces, 代理类实现的接口字节码对象
                                          InvocationHandler h)代理对象的调用处理程序
     */

    //获取代理对象的方法
    public SellTickets getProxyObject(){
        ClassLoader loader = station.getClass().getClassLoader();
        Class<?>[] classes = station.getClass().getInterfaces();

        //jdk提供newProxyInstance获取代理对象
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                loader,
                classes,
                new InvocationHandler(){
                    /*
                    Object proxy 和 proxyObject
                    Method method 对接口中的方法封装的method对象
                    Object[] args 调用方法的实际参数
                    返回值 方法的返回值

                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("invoke");
                        System.out.println("代售点收取服务费（动态代理）");
                        Object invoke = method.invoke(station, args);
                        return invoke;
                    }
                });
        
        return proxyObject;
    }
}
```



**代理工厂在内存生成了代理类**

```java
public final class $Proxy0 extends Proxy implements SellTickets {
    private static Method m3;
    public final void sell() {
        try {
            this.h.invoke(this, m3, null);
            return;
        }
    }

    public $Proxy0(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    static {
        try {
            m3 = Class.forName("proxy.jdk_proxy.SellTickets").getMethod("sell", new Class[0]);
            return;
        }
}
    
public class Proxy implements java.io.Serializable {
    protected InvocationHandler h;
    
    protected Proxy(InvocationHandler h) {
        Objects.requireNonNull(h);
        this.h = h;
    }
}
```

从上面的类中，我们可以看到以下几个信息:
	**代理类（$Proxy0）**实现了sellTickets。这也就印证了我们之前说的**真实类和代理类实现同样的接口。**

​	**代理类($Proxy0）**将我们提供了的**匿名内部类对象传递给了父类。**



执行流程如下:
1．在测试类中通过代理对象调用sell ()方法
2．根据多态的特性，执行的是代理类($Proxy0)中的sell ()方法
3．代理类($Proxy0)中的sell()方法中又调用了InvocationHandler接口的**自实现类对象的invoke方法**

4. invoke方法通过**反射执行**了真实对象所属类(Trainstation)中的sell()方法



### 1.5 **CGLIB代理**（目标类动态代理）

同样是上面的案例，我们再次使用CGLIB代理实现。
	如果没有定义sellTickets接口，只定义了TrainStatian (火车站类)。很显然JDK代理是无法使用了，因为JDK动态代理要求必须定义接口，对接口进行代理。
CGLIB是一个功能强大，高性能的代码生成包。它为**没有实现接口的类提供代理，为JDk的动态代理提供了很好的补充**。
CGLIB是第三方提供的包，所以需要引入jar包的坐标:



```xml
<dependency>
            <groupId>cglib</groupId>
            <artifactId>cglib</artifactId>
            <version>2.2.2</version>
        </dependency>
```



```java
public class ProxyFactory implements MethodInterceptor {

    private TrainStation station1 = new TrainStation();

    public TrainStation getProxyObject(){
        //创建Enhancer对象，类似JDK代理中的proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);

        //创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行了");
        System.out.println("CGLIB服务费");
        Object invoke = method.invoke(station1, objects);
        return invoke;
    }
}
```



### 1.6三种代理的对比

- jdk代理和CGLIB代理
  使用CGLib实现动态代理，CGLib底层采用ASM字节码生成框架，使用字节码技术生成代理类，在JDK1.6之前比使用Java反射效率要高。唯一需要注意的是，CGLib不能对声明为final的类或者方法进行代理，因为CGLib原理是动态生成被代理类的子类。
  在JDK1.6、JDK1.7、JDK1.8逐步对JDK动态代理优化之后，**在调用次数较少的情况下**，JDK代理效率高于cGLib代理效率，只有当进行**大量调用的时候**，JDK1.6和JDK1.7比ccLib代理效率低一点，但是到JDK1.8的时候，J**DK代理效率高于cGLib代理**。所以如果**有接口**使用JDK动态代理，如果**没有接口**使用CGLIB代理。
- 动态代理和静态代理
  动态代理与静态代理相比较，最大的好处是接口中声明的**所有方法都被转移到调用处理器一个集中的方法中处理(InvocationHandler.invoke)**。这样，在接口方法数量比较多的时候，我们可以进行灵活处理，而不需要像静态代理那样每一个方法进行中转。
  如果接口增加一个方法，静态代理模式除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。**增加了代码维护的复杂度**。而动态代理不会出现该问题

### 1.7优缺点

#### **优点**

1代理模式在客户端与目标对象之间起到一个**中介作用和保护目标对象**的作用；

2代理对象可以**扩展目标对象的功能**；

3代理模式能将**客户端与目标对象分离**，在一定程度上**降低了系统的耦合**度；

#### 缺点 

**增加**了**系统的复杂度**。



### 1.7使用场景

#### **远程（Remote）代理**	即RPC思想

本地服务通过网络请求远程服务。为了实现本地到远程的通信，我们需要实现网络通信，处理其中可能的异常。为良好的代码设计和可维护性，我们将网络通信部分隐藏起来，只暴露给本地服务一个接口，通过该接口即可访问远程服务提供的功能，而不必过多关心通信部分的细节。

#### **防火墙（Firewall）代理**

当你将浏览器配置成使用代理功能时，防火墙就将你的浏览器的请求转给互联网；当互联网返回响应时，代理服务器再把它转给你的浏览器。

#### **保护（Protect or Access）代理**

控制对一个对象的访问，如果需要，**可以给不同的用户提供不同级别的使用权限。**

## 2.适配器模式 Adapter

### 2.1.定义：

​		将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。

​		适配器模式分为类适配器模式和对象适配器模式，前者类之间的耦合度比后者高，且要求程序员了解现有组件库中的相关组件的内部结构，所以应用相对较少些。



### **2.2.** **结构**

- **目标（Target）接口：**当前系统业务所期待的接口，它可以是抽象类或接口。（原始对象需要兼容其他）

- **适配者（Adaptee）类**：它是被访问和适配的现存组件库中的组件接口。

- **适配器（Adapter）类：**它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。



### **2.2.** **类适配器模式**

实现方式：定义一个适配器类来实现当前系统的业务接口，同时又继承现有组件库中已经存在的组件。

【例】读卡器

现有一台电脑只能读取SD卡，而要读取TF卡中的内容的话就需要使用到适配器模式。创建一个读卡器，将TF卡中的内容读取出来。

![image-20211224133248606](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224133248606.png)

```java
public class AdapterTF extends TFCardImpl implements SDCard {


    @Override
    public String readSD() {
        System.out.println("adapter read msg tf Card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write msg" + msg);
        writeTF(msg);
    }
}
```



类适配器模式**违背了合成复用原则**。类适配器是客户类**有一个接口规范**的情况下可用，反之不可用。

### **2.3.** **对象适配器模式**

实现方式：对象适配器模式可釆用将现有组件库中已经实现的组件引入适配器类中，该类同时实现当前系统的业务接口。

![image-20211224140810158](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224140810158.png)



```java
public class AdapterTF implements SDCard {

    private TFCrad tfCrad;

    public AdapterTF(TFCrad tfCrad) {
        this.tfCrad = tfCrad;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read msg tf Card");
        return tfCrad.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write msg" + msg);
        tfCrad.writeTF(msg);
    }
}
```

**注意：**还有一个适配器模式是接口适配器模式。当不希望实现一个接口中所有的方法时，可以创建一个抽象类Adapter ，实现所有方法。而此时我们只需要继承该抽象类即可。



### **2.4.** 应用场景

- 以前开发的系统存在满足新系统功能需求的类，但其接口同新系统的接口不一致。

- 使用第三方提供的组件，但组件接口定义和自己要求的接口定义不同

### **2.5.** JDK源码

Reader (字符流)、Inputstream(字节流）的适配使用的是InputstreamReader。
InputStreamReader继承自java.io包中的Reader，对他中的抽象的未实现的方法给出实现。如:

![image-20211224162903484](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224162903484.png)

如上代码中的sd (streamDecoder类对象)，在sun的JDK实现中，实际的方法实现是sun.nio.cs.StreamDecoder类的同名方法的调用封装。类结构图如下:

从上图可以看出:

- InputStreamReader是对同样实现了Reader的streamDecoder的封装。
- StreamDecoder不是Java SE API中的内容，是Sun JDK给出的自身实现。但我们知道他们对构造方法中的字节流类
  ( Iputstream）进行封装，并通过该类进行了字节流和字符流之间的解码转换。

结论:
从表层来看，InputStreamReader做了Inputstream字节流类到Reader字符流之间的转换。而从如上sun JDK中的实现类关系结构中可以看出，是StreamDecoder的设计实现在实际上采用了适配器模式。

## 3.装饰者模式 decorator

### 3.1定义

指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式。

### 3.2结构

- **抽象构件（Component）角色 ：**定义一个抽象接口以规范准备接收附加责任的对象。

- **具体构件（Concrete Component）角色 ：**实现抽象构件，通过装饰角色为其添加一些职责。

- **抽象装饰（Decorator）角色 ：** 继承或实现抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。

- **具体装饰（ConcreteDecorator）角色 ：**实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。

![image-20211225093953561](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225093953561.png)

### 3.3 优点 

1饰者模式可以带来比继承更加灵活性的扩展功能，使用更加方便，可以通过组合不同的装饰者对象来获取具有不同行为状态的多样化的结果。

2装饰者模式比继承更具良好的扩展性，完美的遵循开闭原则，继承是静态的附加责任，装饰者则是动态的附加责任。

3装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。



### 3.4 **使用场景**

- 当不能采用继承的方式对系统进行扩充或者**采用继承不利于系统扩展和维护时。**

- 不能采用继承的情况主要有两类：

- 第一类是**系统中存在大量独立的扩展**，为支持每一种组合将产生大量的子类，使得**子类数目呈爆炸性增长**；

- 第二类是因为**类定义不能继承（如final类）**

- 在不影响其他对象的情况下，**以动态、透明的方式给单个对象添加职责。**

- 当对象的功能要求可以**动态地添加**，也可以再**动态地撤销时**。



### 3.5 JDK源码解析

​	IO流中的包装类使用到了装饰者模式。BufferedInputStream、BufferedOutputStream、BufferedReader、Bufferedwrites。

我们以Bufferedwriter举例来说明，先看看如何使用Bufferedwriter

![image-20211224200747528](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224200747528.png)

**小结**

​	BufferedWriter使用装饰者模式对writer子实现类进行了增强，添加了缓冲区，提高了写数据的效率。



### 3.6代理和装饰者区别

静态代理和装饰者模式的区别:

- 相同点:
  - 都要实现与目标类相同的业务接口
  - 在两个类中都要声明目标对象
  - 都可以在**不修改目标类的前提下增强目标方法**

- 不同点:
  - 目的不同
    装饰者是为了**增强目标对象**
    静态代理是**为了保护和隐藏目标对象**。
  - 获取目标对象构建的地方不同
    装饰者是由外界传递进来，可以通过构造方法传递**静态代理是在代理类内部创建**，以此来**隐藏目标对象**



## 4.桥接模式  Bridge 

用一个例子来讲解，那就是画图，这里有一个画笔，可以画正方形、长方形、圆形（这个大家都知道怎么做吧，我就不解释了）。但是现在我们需要给这些形状进行上色，这里有三种颜色：白色、灰色、黑色。这里我们可以画出3*3=9中图形：白色正方形、白色长方形、白色圆形。。。。。。到这里了我们几乎到知道了这里存在两种解决方案：

方案一：为每种形状都提供各种颜色的版本。

方案二：根据实际需要对颜色和形状进行组合。

我们我们采用方案一来实现的话，我们是不是也可以这样来理解呢？为每种颜色都提供各种形状的版本呢？这个是完全的可以的。如下：

![image-20211224201425676](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224201425676.png)

![image-20211224201431130](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224201431130.png)

![image-20211224201442757](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224201442757.png)

### 4.1 定义

​		抽象与实现分离，使它们可以独立变化。它是用**组合关系代替继承关系**来实现，从而**降低了抽象和实现这两个可变维度的耦合度**。

### 4.2 结构

1.**抽象化（Abstraction）角色** ：定义抽象类，并包含一个对实现化对象的引用。

2.**扩展抽象化（Refined Abstraction）角色** ：是**抽象化角色的子类**，实现父类中的业务方法，并通过**组合关系调用实现化角色中的业务方法**。

3.**实现化（Implementor）角色 ：**定义实现化角色的接口，供扩展抽象化角色调用。

4.**具体实现化（Concrete Implementor）角色** ：给出**实现化角色接口的具体实现**。

![image-20211224202127068](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224202127068.png)

### 4.3 优缺点

**优点** 

1、分离抽象接口及其实现部分。提高了**比继承更好的解决方案**。

2、桥接模式提高了系统的可扩充性，在**两个变化维度中任意扩展一个维度**，都不需要修改原有系统。

3、**实现细节对客户透明，可以对用户隐藏实现细节**。

 **缺点** 

 1、桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。

2、桥接模式**要求正确识别出系统中两个独立变化的维度**，因此其使用范围具有一定的局限性。



#### 4.4**使用场景**

当一个类存在两个独立变化的维度，且这两个维度都需要进行扩展时。

当一个系统不希望使用继承或因为**多层次继承导致系统类的个数急剧增加时**。

当一个系统需要在构件的**抽象化角色和具体化角色之间增加更多的灵活性时**。避免在两个层次之间建立静态的继承联系，通过桥接模式**可以使它们在抽象层建立一个关联关系。**





## 5.外观模式 **facade**

​		在有些人可能炒过股票，但其实大部分人都不太懂，这种没有足够了解证券知识的情况下做股票是很容易亏钱的，刚开始炒股肯定都会想，如果有个懂行的帮帮手就好，其实基金就是个好帮手，支付宝里就有许多的基金，它将投资者分散的资金集中起来，交由专业的经理人进行管理，投资于股票、债券、外汇等领域，而基金投资的收益归持有者所有，管理机构收取一定比例的托管管理费用。![image-20211224204152323](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224204152323.png)

### 5.1 定义

​		是一种通过为多个复杂的子系统**提供一个一致的接口**，而使这些子系统更加容易被访问的模式。该模式对外有一个统一接口，外部应用程序不用关心内部子系统的具体的细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。

### 5.2 **结构**

1.**外观（Facade）角色：**为多个子系统对外提供一个共同的接口。

2.**子系统（Sub System）角色：**实现系统的部分功能，客户可以通过外观角色访问它。

![image-20211224204740345](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224204740345.png)



### 5.3优缺点

**优点**

1.**降低了子系统与客户端之间的耦合度**，使得子系统的变化不会影响调用它的客户类。

2.对**客户屏蔽了子系统组件**，**减少了客户处理的对象数目**，并使得子系统使用起来更加容易。

**缺点**

**不符合开闭原则**，修改很麻烦

### 5.4**使用场景**

1.对**分层结构系统构建**时，使用外观模式定义子系统中每层的入口点可以简化子系统之间的依赖关系。

2.当**一个复杂系统的子系统很多**时，外观模式可以为系统设计一个简单的接口供外界访问。

3.当**客户端与多个子系统之间存在很大的联系**时，引入外观模式可将它们分离，从而提高子系统的独立性和可移植性

### 5.5源码解析

使用tomcat作为web容器时，接收浏览器发送过来的请求，tomcat会将请求信息封装成servletRequest对象，如下图①处对象。但是大家想想servletReuest是一个接口，它还有一个子接口:HttpServletRequest，而我们知道该request对象肯定是一个HttpServletRequest对象的子实现类对象，到底是哪个类的对象呢?可以通过输出request对象，我们就会发现是一个名为Requestfacade的类的对象。

![image-20211224210529077](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224210529077.png)

RequestFacade类就使用外观模式。先看结构图

![image-20211224210733733](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224210733733.png)

**为什么在此处使用外观模式呢?**

​		定义RequestFacade类，分别实现 ServletRequest，同时定义私有成员变量Request，并且方法的实现调用Request的实现。然后，将BequestFacade上转为ServletRequest传给servlet的 service方法，这样即使在 servlet中被下转为RecqestFacade，也不能访问私有成员变量对象中的方法。既用了Request，又能防止其中方法被不合理的访问。

## 6.组合模式 Composite

​		在现实生活中，存在很多《部分-整体》的关系 ，例如大学中的部门与学院、总公司中的部门与分公司。在软件开发中也是这样，例如，文件系统中的文件与文件夹、窗体程序中的简单控件与容器控件等。对这些简单对象与复合对象的处理，如果用组合模式来实现会很方便。

![image-20211224220409346](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224220409346.png)

![image-20211224220414241](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224220414241.png)

### 6.1定义

​		又名部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。

### 6.2**结构**

**1.抽象根节点（Component）：**定义系统各层次对象的共有方法和属性，可以预先定义一些默认行为和属性。

**2.树枝节点（Composite）：**定义树枝节点的行为，存储子节点，组合树枝节点和叶子节点形成一个树形结构。

**3.叶子节点（Leaf）：**叶子节点对象，其下再无分支，是系统层次遍历的最小单位。

![image-20211224232601228](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224232601228.png)

![image-20211224232623082](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211224232623082.png)



```java
public abstract class MenuComponent {
    protected String name;
    protected int level;

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();

    }

    public String getName(){
        return name;
    }

    public abstract void print();

}
```

### 6.3 组合模式的分类

​	在使用组合模式时，根据抽象构件类的定义形式，我们可将组合模式分为透明组合模式和安全组合模式两种形式。

**1.透明组合模式**

​		透明组合模式中，抽象根节点角色中**声明了所有用于管理成员对象的方法**，比如在示例中 MenuComponent 声明了 add、remove 、getChild 方法，这样做的**好处是确保所有的构件类都有相同的接口**。透明组合模式也是组合模式的标准形式。

透明组合模式的**缺点**是**不够安全**，因为叶子对象和容器对象在本质上是有区别的，叶子对象不可能有下一个层次的对象，即不可能包含成员对象，因此为其提供 add()、remove() 等方法是没有意义的，这在编译阶段不会出错，**但在运行阶段如果调用这些方法可能会出错（如果没有提供相应的错误处理代码）**

**2.安全组合模式**

​		在安全组合模式中，在抽象构件角色中**没有声明任何用于管理成员对象的方法**，而是在**树枝节点 Menu 类中声明并实现这些方法**。安全组合模式的**缺点是不够透明**，因为叶子构件和容器构件具有不同的方法，**且容器构件中那些用于管理成员对象的方法没有在抽象构件类中定义**，因此客户端不能完全针对抽象编程，必须有区别地对待叶子构件和容器构件。不能面向抽象编程

**![image-20211225001350449](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225001350449.png)**

### 6.4 优缺点

**优点如下** 

​		①组合模式使得客户端代码可以一致地**处理单个对象和组合对象**，无 

须关心自己处理的是单个对象，还是组合对象，这**简化了客户端代码**；

​		②更容易在组合体内加入新的对象 **客户端不会因为加入了新的对象而更改源代码，满足“开闭原则”。** 

**缺点如下**

 ①设计较复杂，客户端**需要花更多时间理清类之间的层次关系**

 ②不容易限制 容器中的构件

 ③不容易用**继承的方法来增加构件的新功能**。

### 6.5 **使用场景**

​		组合模式正是应树形结构而生，所以组合模式的使用场景就是出现树形结构的地方。比如：**文件目录显示**，**多级目录呈现等树形结构数据的操作**。



## 7.享元模式 flyweight

​		在面向对象程序设计过程中，有时会面临要创建大量相同或相似对象实例的问题。创建那么多的对象将会耗费很多的系统资源，它是系统性能提高的一个瓶颈。例如，围棋和五子棋中的黑白棋子，图像中的坐标点或颜色，局域网中的路由器、交换机和集线器，教室里的桌子和凳子等。这些对象有很多相似的地方，如果能**把它们相同的部分提取出来共享**，则能节省大量的系统资源，这就是享元模式的产生背景。

### 7.**1**定义：

运用共享技术来有效地支持**大量细粒度对象的复用。**它通过共享已经存在的对象来大幅度**减少需要创建的对象数量、避免大量相似类的开销**，从而提高系统资源的利用率。

### 7.**2.** **结构**

享元模式中存在以下两种状态：

**内部状态**，即**不会随着环境的改变而改变的可共享部分**；

**外部状态**，指**随环境改变而改变的不可以共享的部分**。

享元模式的实现要领就是**区分**应用中的这**两种状态**，**并将外部状态外部化**。

下面来分析其基本结构和实现方法。

1.**抽象享元角色（Flyweight）:** 是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。

2.**具体享元（Concrete Flyweight）角色：**实现抽象享元角色中所规定的接口。 

3.**非享元（Unsharable Flyweight)角色：**是不可以共享的**外部状态**，它以参数的形式注入具体享元的相关方法中。 

4.**享元工厂（Flyweight Factory）角色**：负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。

![image-20211225002552607](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225002552607.png)



![image-20211225002654103](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225002654103.png)

```java
/**
 * @author wxl
 * @version 1.0
 * @description: 享元工厂类 设计为单例
 * @date 2021/12/25 0:34
 */
public class BoxFactory {
    private HashMap<String, AbstractBox> map;

    private static BoxFactory boxFactory = new BoxFactory();

    private BoxFactory(){
        map = new HashMap<>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }

    public static BoxFactory getInstance(){
        return boxFactory;

    }

    public AbstractBox getShape(String name){
        return map.get(name);
    }
}
```

### 7.3 优缺点

**优点是：**

​		相同对象只要保存一份，这**降低了系统中对象的数量**，从而**降低了系统中细粒度对象给内存带来的压力**。

**缺点是：**

1. 为了使对象可以共享，需要将一些**不能共享的状态外部化**，这将**增加程序的复杂性。**
2. **读取享元模式的外部状态**会使得**运行时间稍微变长**。

### 7.4 **使用场景**

前面分析了享元模式的结构与特点，下面分析它适用的应用场景。享元模式是通过**减少内存中对象的数量来节省内存空间的**，所以以下几种情形适合采用享元模式。

1系统中存在**大量相同或相似的对象，**这些对象耗费大量的内存资源。

2大部分的对象可以按照内部状态进行分组，**且可将不同部分外部化**，这样每一个组只需保存一个内部状态。

3**由于享元模式需要额外维护一个保存享元的[数据结构](https://links.jianshu.com/go?to=http%3A%2F%2Fc.biancheng.net%2Fdata_structure%2F)**，所以应当在有足够多的享元实例时才值得使用享元模式。



### 7.5 **JDK源码解析 **



![image-20211225005044216](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225005044216.png)

```java
public final class Integer extends Number implements Comparable<Integer> {
private static class IntegerCache {
    static final int low = -128;
    static final int high;
    static final Integer cache[];

    static {
        // high value may be configured by property
        int h = 127;
        String integerCacheHighPropValue =
            sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
        if (integerCacheHighPropValue != null) {
            try {
                int i = parseInt(integerCacheHighPropValue);
                i = Math.max(i, 127);
                // Maximum array size is Integer.MAX_VALUE
                h = Math.min(i, Integer.MAX_VALUE - (-low) -1);
            } catch( NumberFormatException nfe) {
                // If the property cannot be parsed into an int, ignore it.
            }
        }
        high = h;

        cache = new Integer[(high - low) + 1];
        int j = low;
        for(int k = 0; k < cache.length; k++)
            cache[k] = new Integer(j++);

        // range [-128, 127] must be interned (JLS7 5.1.7)
        assert IntegerCache.high >= 127;
    }

    private IntegerCache() {}
}
}
```

可以看到Integer默认先创建并缓存-128 ~ 127之间数的Integer对象，**当调用valueof 时如果参数在-128～127之间则计算下标并从缓存中返回**，否则创建一个新的Integer对象。













# 四.行为模式

**反向控制**

行为型模式用于描述程序在运行时复杂的流程控制，即描述多个类或对象之间怎样相互协作共同完成单个对象都无法单独完成的任务，**它涉及算法与对象间职责的分配。**

行为型模式分为**类行为模式和对象行为模式**，前者采用**继承机制来在类间分派行为**，后者采用**组合或聚合在对象间分配行为**。由于组合关系或聚合关系比继承关系耦合度低，满足“合成复用原则”，所以对象行为模式比类行为模式具有更大的灵活性。

行为型模式分为:

- 模板方法模式
- 策略模式
- 命令模式
- 职责链模式
- 状态模式
- 观察者模式
- 中介者模式
- 迭代器模式
- 访问者模式
- 备忘录模式
- 解释器模式
  以上11 种行为型模式，除了模板方法模式和解释器模式是类行为型模式，其他的全部属于对象行为型模式。

## 1.模板方法模式 template

​		在面向对象程序设计过程中，程序员常常会遇到这种情况：设计一个系统时知道了算法所需的关键步骤，而且确定了这些步骤的执行顺序，但某些步骤的具体实现还未知，或者说某些步骤的实现与具体的环境相关。

例如，去银行办理业务一般要经过以下4个流程：取号、排队、办理具体业务、对银行工作人员进行评分等，其中取号、排队和对银行工作人员进行评分的业务对每个客户是一样的，可以在父类中实现，但是办理具体业务却因人而异，它可能是存款、取款或者转账等，可以延迟到子类中实现。

### 1.1 定义：

​		定义一个操作中的算法骨架，而将**算法的一些步骤延迟到子类**中，使得子类可以不改变该算法结构的情况下**重定义该算法的某些特定步骤。**

### 1.2. 结构

- **抽象类（Abstract Class）：**负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。

  - 模板方法：定义了**算法的骨架**，按某种顺序调用其包含的基本方法。
  - 基本方法：是**实现算法各个步骤的方法**，是模板方法的组成部分。基本方法又可以分为三种：
    - **抽象方法(Abstract Method) ：**一个抽象方法由抽象类声明、由其具体子类实现。因环境而定**推迟到子类**中来**实现**
    - **具体方法(Concrete Method) ：**一个**具体方法由一个抽象类或具体类声明并实现**，其**子类可以进行覆盖也可以直接继承**。不会因环境而改变在父类中实现
    - **钩子方法(Hook Method)** ：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种。一般钩子方法**是用于判断的逻辑方法**，这类方法名一般为isXxx，返回值类型为boolean类型。

- **具体子类（Concrete Class）：**实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的组成步骤。

  ![image-20211225100617869](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225100617869.png)
  
  ```java
  public abstract class AbstractClass {
  
      //模板方法定义的规则
      public final void cookProcess(){
          pourOil();
          heatOil();
          pourVegetable();
          pourSauce();
          fry();
      }
  
  
  
      //基本方法
      public void pourOil(){
          System.out.println("倒油");
      }
      //基本方法
      public void heatOil(){
          System.out.println("热油");
      }
      //基本方法
      public void fry(){
          System.out.println("炒菜");
      }
  
      //倒包菜 抽象方法
      public abstract void pourVegetable();
  
      //倒调料品
      public abstract void pourSauce();
  
  
  }
  ```



### 1.3 优缺点

**优点：**

- 提高代码复用性

  将相同部分的代码放在抽象的父类中，而**将不同的代码放入不同的子类**中。

- 实现了反向控制

  通过一个**父类调用其子类的操作**，通过对子类的**具体实现扩展不同的行为，实现了反向控制** ，并**符合“开闭原则”**。

**缺点：**

- 对每个不同的实现都需要定义一个子类，这会导致类的个数增加，系统更加庞大，设计也更加抽象。

- 父类中的抽象方法由子类实现，子类执行的结果会影响父类的结果，这导致一种**反向的控制结构，它提高了代码阅读的难度**。



### 1.4 **使用场景**

- 算法的**整体步骤很固定，但其中个别部分易变时**，这时候可以使用模板方法模式，将容易变的部分抽象出来，供子类实现。
- 需要通过**子类来决定父类算法中某个步骤是否执行**，实现子类对父类的**反向控制**。



### 1.5 **JDK源码**

InputStream类就使用了模板模式。在InputStream类中定义了多个read（）方法，如下：

```java
public abstract class InputStream implements Closeable {
    //抽象方法
    public abstract int read() throws IOException;
    public int read(byte b[]) throws IOException {
        return read(b, 0, b.length);
    }
    
    public int read(byte b[], int off, int len) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        } else if (off < 0 || len < 0 || len > b.length - off) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return 0;
        }

        int c = read();//调用了无参的read（）方法
        if (c == -1) {
            return -1;
        }
        b[off] = (byte)c;

        int i = 1;
        try {
            for (; i < len ; i++) {
                c = read();
                if (c == -1) {
                    break;
                }
                b[off + i] = (byte)c;
            }
        } catch (IOException ee) {
        }
        return i;
    }
    
}
```





## 2.策略模式 strategy

### 2.1 定义：

​		该模式定义了一系列算法，并将每个算法封装起来，使它们可以**相互替换，**且算法的变化不会影响使用算法的客户。策略模式属于对象行为模式，它通过对算法进行封装，把**使用算法的责任和算法的实现分割开**来，并委派给不同的**对象对这些算法进行管理**。

### 2.**2 **结构

- **抽象策略（Strategy）类：**这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
- **具体策略（Concrete Strategy）类：**实现了抽象策略定义的接口，提供具体的算法实现或行为。
- **环境（Context）类**：持有一个**策略类的引用，**最终给客户端调用。

![image-20211225133912997](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225133912997.png)

### 2.**3** 优缺点

**优点：**

- 策略类之间**可以自由切换**

  由于策略类**都实现同一个接口**，所以使它们之间可以自由切换。

- **易于扩展**

  增加一个新的策略只需要添加一个具体的策略类即可，基本不需要改变原有的代码，符合“开闭原则“

- **避免使用多重条件选择语句（if else）**，充分体现面向对象设计思想。

**缺点：**

- 客户端**必须知道所有的策略类**，并自行决定使用哪一个策略类。

- 策略模式将造成产生很多策略类，可以通过使用**享元模式在一定程度上减少对象**的数量。

### **2.4** **使用场景**

- 一个系统需要**动态地在几种算法中选择一种时**，可将每个算法封装到策略类中。

- 一个类定义了多种行为，并且这些行为在这个类的操作中以多个条件语句的形式出现，可将每个条件分支移入它们各自的策略类中**以代替这些条件语句。**

- 系统中各算法彼此完全独立，且要求对**客户隐藏具体算法的实现细节时**。

- 系统要求**使用算法的客户不应该知道其操作的数据时**，可使用策略模式来隐藏与算法相关的数据结构。

- 多个类**只区别在表现行为不同，可以使用策略模式**，在运行时动态选择具体要执行的行为。

### **2.5** **JDK源码**

comparator中的策略模式。在Arrays类中有一个sort()方法，如下:

```java
public class Arrays {
public static <T> void sort(T[] a, Comparator<? super T> c) {
    if (c == null) {
        sort(a);
    } else {
        if (LegacyMergeSort.userRequested)
            legacyMergeSort(a, c);
        else
            TimSort.sort(a, 0, a.length, c, null, 0, 0);
    }
}
}
```

Arrays就是一个环境角色类，这个sort方法可以传一个新策略让Arrays根据这个策略来进行排序。就比如下面

![image-20211225140207011](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225140207011.png)



这里我们在调用Arrays的sort方法时，第二个参数传递的是comparator接口的子实现类对象。所以comparator充当的是抽象策略角色，而具体的子实现类充当的是具体策略角色。环境角色类(Arrays）应该持有抽象策略的引用来调用。那么，Arrays类的sort方法到底有没有使用comparator子实现类中的compare()方法吗?让我们继续查看Timsort类的 sort()方法，代码如下:

```java
class TimSort<T> {
static <T> void sort(T[] a, int lo, int hi, Comparator<? super T> c,
                     T[] work, int workBase, int workLen) {
    assert c != null && a != null && lo >= 0 && lo <= hi && hi <= a.length;

    int nRemaining  = hi - lo;
    if (nRemaining < 2)
        return;  // Arrays of size 0 and 1 are always sorted

    // If array is small, do a "mini-TimSort" with no merges
    if (nRemaining < MIN_MERGE) {
        int initRunLen = countRunAndMakeAscending(a, lo, hi, c);
        binarySort(a, lo, hi, lo + initRunLen, c);
        return;
    }
    
。。。。。
}
private static <T> int countRunAndMakeAscending(T[] a, int lo, int hi,
                                                    Comparator<? super T> c) {
        assert lo < hi;
        int runHi = lo + 1;
        if (runHi == hi)
            return 1;

        // Find end of run, and reverse range if descending
        if (c.compare(a[runHi++], a[lo]) < 0) { // Descending
            while (runHi < hi && c.compare(a[runHi], a[runHi - 1]) < 0)
                runHi++;
            reverseRange(a, lo, runHi);
        } else {                              // Ascending
            while (runHi < hi && c.compare(a[runHi], a[runHi - 1]) >= 0)
                runHi++;
        }

        return runHi - lo;
    }
}
```

## 3.命令模式 command

​		在软件开发系统中，常常出现“方法的请求者 与“方法的实现者”之间存在紧密的相合关系。这不利于软件功能的扩展与维护。例如， 想对行为进行“撤销、重做、记录 等处理都很不方便，因此“如何将方法的请求者与方法的实现者解搞？ 变得很重要，命令模式能很好地解决这个问题。

在现实生活中，这样的例子 很多，例如，电视 遥控器（命令发送者）通过按钮（具体命令）来遥控电丰岛机 （命令接 者），还有 键盘上的 “功能 等。

![image-20211225140815860](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225140815860.png)

### 3.1.定义：

​		将一个请求封装为一个对象，使**发出请求**的责任和**执行请求**的责任分割开。这样两者之间通过命令对象进行沟通，这样方便将命令对象进行**存储、传递、调用、增加与管理**

### 3.2结构

命令模式包含以下主要角色。

1. **抽象命令类（Command）角色：**声明执行命令的接口，拥有执行命令的抽象方法 execute()。
2. **具体命令类（Concrete Command）角色**：是抽象命令类的具体实现类**，它拥有接收者对象**，并通过调用接收者的功能来完成命令要执行的操作。
3. **实现者/接收者（Receiver）角色：**执行命令功能的相关操作，是具体命令对象业务的真正实现者。
4. **调用者/请求者（Invoker）角色**：是请求的发送者，它通常**拥有很多的命令对象，**并通过访问命令对象来执行相关请求，它不直接访问接收者。



![image-20211225162659649](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225162659649.png)

### 3.3 优缺点

**优点：**

- 降低系统的耦合度。命令模式能将调用操作的对象与实现该操作的对象解耦。

- 增加或删除命令非常方便。采用命令模式增加与删除命令不会影响其他类，**它满足“开闭原则”，对扩展比较灵活**。

- 可以实现宏命令。命令模式可以与组合模式结合，将多个命令装配成一个组合命令，即**宏命令**。

- 方便实现 **Undo 和 Redo** 操作。命令模式可以与后面介绍的备忘录模式结合，**实现命令的撤销与恢复**。

**缺点**

- 使用命令模式可能会导致某些系统**有过多的具体命令类。**

- 系统**结构更加复杂。**

### 3.4 使用场景

- 系统需要将请求**调用者和请求接收者解耦**，使得调用者和接收者不直接交互。

- 系统需要在不同的时间**指定请求、将请求排队和执行请求。**

- 系统需要支持命令的**撤销(Undo)操作和恢复(Redo)操作。**

### 3.5 JDK源码

Runnable是一个典型命令模式，Runnable担当命名角色，Thread充当的是调用者，start方法就是其执行方法

```java
//命令接口
public interface Runnable {
    public abstract void run();
}
调用者
class Thread implements Runnable {
    
    private Runnable target;
    public synchronized void start() {
            if (threadStatus != 0)
                throw new IllegalThreadStateException();


            group.add(this);

            boolean started = false;
            try {
                start0();
                started = true;
            } finally {
                try {
                    if (!started) {
                        group.threadStartFailed(this);
                    }
                } catch (Throwable ignore) {
                    /* do nothing. If start0 threw a Throwable then
                      it will be passed up the call stack */
                }
            }
        }
}
```



会调用一个native方法start（），调用系统方法，开启一个线程。而接收者是对程序员开放的，可以自己定义接收者

![image-20211225190950884](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225190950884.png)

## 4.责任链模式  Chain of responsibility

​		在现实生活中，**一个事件需要经过多个对象处理**是很常见的场景。例如，采购审批流程、请假流程等。公司员工请假，可批假的领导有部门负责人、副总经理、总经理等，但每个领导能批准的天数不同，员工必须根据需要请假的天数去找不同的领导签名，也就是说员工必须记住每个领导的姓名、电话和地址等信息，这无疑增加了难度。

​		在计算机软硬件中也有相关例子，如总线网中数据报传送，每台计算机根据目标地址是否同自己的地址相同来决定是否接收；还有异常处理中，处理程序根据异常的类型决定自己是否处理该异常；还有 [Struts2](http://c.biancheng.net/struts2/) 的拦截器、[JSP](http://c.biancheng.net/jsp/) 和 [Servlet](http://c.biancheng.net/servlet/) 的 Filter 等，所有这些，都可以考虑使用责任链模式来实现。



### 4.1定义

​		为了避免**请求发送者与多个请求处理者耦合在一起**，于是将所有请求的处理者**通过前一对象记住其下一个对象的引用而连成一条链**；**当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止**。

### 4.2 结构

职责链模式主要包含以下角色。

1. **抽象处理者（Handler）角色：**定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
2. **具体处理者（Concrete Handler）角色**：实现抽象处理者的处理方法，判断能否处理本次请求，**如果可以处理请求则处理，否则将该请求转给它的后继者。**
3. **客户类（Client）角色：**创建处理链，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程。

<img src="C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225192540369.png" alt="image-20211225192540369" style="zoom: 200%;" />

### 4.3 优缺点

**优点**：

- **降低**了对象之间的**耦合度**

  该模式降低了请求发送者和接收者的耦合度。

- **增强了系统的可扩展性**

  可以根据需要增加新的请求处理类，满足开闭原则。

- **增强了**给对象指派职责的**灵活性**

  当工作流程发生变化，可以动态地改变链内的成员或者修改它们的次序，也可动态地新增或者删除责任。

- 责任链**简化了对象之间的连接**

  一个对象只需保持一个指向其后继者的引用，不需保持其他所有处理者的引用，这避免了使用众多的 if 或者 if···else 语句。

- 责任分担

  每个类只需要处理自己该处理的工作，不能处理的传递给下一个对象完成，明确各类的责任范围，符合类的**单一职责原则**。

**缺点**：

- 不能保证每个请求一定被处理。由于一个**请求没有明确的接收者，**所以不能保证它一定会被处理，**该请求可能一直传到链的末端都得不到处理。**

- 对比较长的职责链，请求的处理可能涉及多个处理对象，系统性能将受到一定影响。

- 职责链建立的**合理性要靠客户端来保证，增加了客户端的复杂性**，可能会由于职责链的**错误设置而导致系统出错，如可能会造成循环调用**。

### 4.4使用场景

1. 多个对象可以处理一个请求，但具体由哪个对象处理该请求在运行时自动确定。

2. 可动态指定一组对象处理请求，或添加新的处理者。

3. 需要在不明确指定请求处理者的情况下，向多个处理者中的一个提交请求。

### 4.5 JDK源码解析

在iavaweb应用开发中，Filterchain是职责链(过滤器）模式的典型应用，以下是Filter的模拟实现分析:

- 模拟web请求Request以及响应Response

```java
public interface Response {
}
public interface Response {
}

```

模拟web过滤器Filter

```java
public interface Filter {
    public void doFilter(Request req,Response res,FilterChain c);
}
```

模拟实现具体过滤器

```java
public class SecondFilter implements Filter {
    public void doFilter(Request req, Response res, FilterChain chain) {
        System.out.println("过滤器2 前置处理");

        // 先执行所有request再倒序执行所有response
        chain.doFilter(req, res);

        System.out.println("过滤器2 后置处理");
    }
}
public class FirstFilter implements Filter {
    public void doFilter(Request req, Response res, FilterChain chain) {
        System.out.println("过滤器1 前置处理");

        // 先执行所有request再倒序执行所有response
        chain.doFilter(req, res);

        System.out.println("过滤器1 后置处理");
    }
}

```

模拟实现过滤器链FilterChain

```java
public class FilterChain { //过滤器链

    private List<Filter> filters = new ArrayList<Filter>();

    private int index = 0;

    // 链式调用
    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}
```



## 5.状态模式  state

状态这个词汇我们并不陌生，在日常生活中，不同时间就有不同的状态，早上起来精神饱满，中文想睡觉，下午又渐渐恢复，晚上可能精神更旺也可能耗费体力只想睡觉，这一天中就对应着不同的状态。或者对软件开发人员更形象的描述可能是UML的状态图（即用于描述一个实体基于事件反应的动态行为，显示了该实体如何根据当前所处的状态对不同的事件做出反应）。

　　其实相对来说，就是一种状态的变化，而状态模式主要解决的问题就是当控制一个对象状态转换的条件表达式过于复杂时的情况。即把状态的判断逻辑转移到标识不同状态的一系列类当中。

![image-20211225203704742](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225203704742.png)

问题分析:

- 使用了大量的switch...case这样的判断(if...else也是一样)，使程序的可阅读性变差。

- 扩展性很差。如果新加了断电的状态，我们需要修改上面判断逻辑

### 5.1定义

​		**对有状态的对象**，把复杂的“判断逻辑”提取到不同的状态对象中，允许**状态对象在其内部状态发生改变时改变其行为**

### 5.2 结构

- **环境（Context）角色：**也称为上下文，它定义了客户程序**需要的接口**，维护一个当前状态，并将与**状态相关的操作委托给当前状态对象来处理**。
- **抽象状态（State）角色：**定义一个接口，用以**封装环境对象中的特定状态所对应的行为**。
- **具体状态（Concrete State）角色：**实现抽象状态所对应的行为。

![image-20211225205825769](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225205825769.png)



### 5.3 优缺点

**优点：**

- 将所有与某个状态有关的行为放到一个类中，并且可以方便地增**加新的状态**，只需要改变对象状态即可改变对象的行为。

- 允许状态**转换逻辑与状态对象合成**一体，而不是某一**个巨大的条件语句块**。

**缺点：**

- 状态模式的使用必然会增加系统类和**对象的个数**。

- 状态模式的**结构与实现都较为复杂**，如果使用**不当将导致程序结构和代码的混乱**。

- 状态模式**对"开闭原则"的支持并不太好**。

### 5.4使用场景

- 当一个对象的行为**取决于它的状态**，并且它**必须在运行时根据状态改变它的行为时**，就可以考虑使用状态模式。
- 一个操作中**含有庞大的分支结构**，并且这些**分支决定于对象的状态时**。

## 6.观察者模式 Observe

​		在现实世界中，许多对象并不是独立存在的，其中一个对象的行为发生改变可能会导致一个或者多个其他对象的行为也发生改变。例如，某种商品的物价上涨时会导致部分商家高兴，而消费者伤心；还有，当我们开车到交叉路口时，遇到红灯会停，遇到绿灯会行。这样的例子还有很多，例如，股票价格与股民、微信公众号与微信用户、气象局的天气预报与听众、小偷与警察等。
  		在软件世界也是这样，例如，Excel 中的数据与折线图、饼状图、柱状图之间的关系；MVC 模式中的模型与视图的关系；事件模型中的事件源与事件处理者。所有这些，如果用观察者模式来实现就非常方便。

### 6.1定义：

​		指多个对象间存在**一对多的依赖**关系，当**一个对象的状态发生改变**时，所有依赖于它的对象都得到通知并被自动更新。
这种模式有时又称作**发布-订阅**模式、**模型-视图**模式，它是对象行为型模式。

### 6.2结构

- **抽象主题（Subject）角色：**也叫抽象目标类，它提供了一个用于**保存观察者对象**的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
- **具体主题（Concrete Subject）角色：**也叫具体目标类，它实现抽象目标中的通知方法，当**具体主题的内部状态发生改变时，通知所有注册过的观察者对象**。
- **抽象观察者（Observer）角色：**它是一个抽象类或接口，它包含了一个**更新自己的抽象方法**，当接到**具体主题的更改通知时被调用。**
- **具体观察者（Concrete Observer）角色：**实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时**更新自身的状态。**
- ![image-20211225213642336](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225213642336.png)

### 6.3 优缺点

**优点:**

​	1降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系。符合依赖倒置原则。

​	2目标与观察者之间建立了一套触发机制。

**缺点:**

​	1目标与观察者之间的**依赖关系并没有完全解除**，而且有可能出现**循环引用**。

​	2当观察者对象很多时，**通知的发布会花费很多时间**，**影响程序的效率**。

### 6.4使用场景

​	在软件系统中，当系统一方行为依赖另一方行为的变动时，可使用**观察者模式松耦合联动双方**，使得一方的变动可以通知到感兴趣的另一方对象，从而让另一方对象对此做出响应。

### 6.5 JDK源码

在Java中，通过Java.util.0bservable类和iava.util.Obsever、接口定义了观察者模式，只要实现它们的子类就可以编写观察者模式实例。

#### 1.Observable类

Observable是具体主题角色类，它有一个Vector集合成员变量，用于保存所有要通知的观察者对象，下面来介绍它最重要的3个方法。

**addObserver(Observer o)** 用于添加观察者对象

**notifyObservers(Object arg)**方法:调用集合中的所有观察者对象的update方法，通知它们数据发生改变。通常越晚加入集合的观察者越先得到通知。
**setChanged()**方法:用来设置一个boolean类型的内部标志，注明目标对象发生了变化。当它为true时，notifyObservers(Object arg) 才会通知观察者。

```java
public synchronized void addObserver(Observer o) {
    if (o == null)
        throw new NullPointerException();
    if (!obs.contains(o)) {
        obs.addElement(o);
    }
}
 public void notifyObservers(Object arg) {
        /*
         * a temporary array buffer, used as a snapshot of the state of
         * current Observers.
         */
        Object[] arrLocal;

        synchronized (this) {
            
            if (!changed)
                return;
            arrLocal = obs.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length-1; i>=0; i--)
            ((Observer)arrLocal[i]).update(this, arg);
}
protected synchronized void setChanged() {
        changed = true;
}
    
```

#### 2.Observer接口

observer接口是抽象观察者，它监视目标对象的变化，当目标对象发生变化时，观察者得到通知，并调用update方法，进行相应的工作。

## 7.中介者模式 Mediator

​		一般来说，同事类之间的**关系是比较复杂的**，多个同事类之间互相关联时，他们之间的关系会呈现为复杂的网状结构，这是一种过度耦合的架构，即不利于类的复用，也不稳定。例如在下左图中，有六个同事类对象，假如对象1发生变化，那么将会有4个对象受到影响。如果对象2发生变化，那么将会**有5个对象受到影响。也就是说，同事类之间直接关联的设计是不好**的。

如果引入中介者模式，那么同事类之间的关系将变为星型结构，从下右图中可以看到，任何一个类的变动，只会影响的类本身，以及中介者，这样就**减小了系统的耦合**。一个好的设计，必定不会把所有的对象关系处理逻辑封装在本类中，而是使用一个专门的类来管理那些不属于自己的行为。

![image-20211225221117924](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225221117924.png)

### 7.**1.定义：**

又叫调停模式，定义一个中介角色来封装一系列对象之间的交互，使原有对象之间的**耦合松散**，且可以**独立地改变它们之间的交互**。

### 7.**2.** **结构**

- **抽象中介者（Mediator）角色：**它是中介者的接口，提供了**同事对象注册**与的抽象方法。
- **具体中介者（ConcreteMediator）角色：**实现中介者接口，定义一个 List 来管理同事对象，**协调各个同事角色之间的交互关系**，因此它依赖于同事角色。
- **抽象同事类（Colleague）角色**：定义同事类的接口，保存中介者对象，**提供同事对象交互**的抽象方法，实现所有相互影响的同事类的公共功能。
- **具体同事类（Concrete Colleague）角色：**是抽象同事类的实现者，当需要与其他同事对象交互时，由**中介者对象负责后续的交互**。
- ![image-20211225225832283](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225225832283.png)

### 7.3 优缺点

**优点**

​	1**降低**了目标与观察者之间的**耦合关系**，两者之间是**抽象耦合关系**。符合依赖倒置原则。

​	2目标与观察者之间建立了一套触发机制。

**缺点**

​	1目标与观察者之间的依**赖关系并没有完全解除，而且有可能出现循环引用**。

​	2当**观察者对象很多时**，通知的发布会花费很多时间，影响程序的效率。

### 7.4使用场景

​		在软件系统中，当系统一方行为依赖另一方行为的变动时，可使用观察者模式**松耦合联动双方**，使得一方的变动可以通知到感兴趣的另一方对象，从而让另一方对象对此做出响应。

## 8.迭代器模式 iterator

​		在现实生活以及程序设计中，经常要访问一个聚合对象中的各个元素，如“[数据结构](http://c.biancheng.net/data_structure/)”中的链表遍历，通常的做法是将链表的创建和遍历都放在同一个类中，但这种方式不利于程序的扩展，如果要更换遍历方法就必须修改程序源代码，这违背了 “开闭原则”。
  既然将遍历方法封装在聚合类中不可取，那么聚合类中不提供遍历方法，将遍历方法由用户自己实现是否可行呢？答案是同样不可取，因为这种方式会存在两个缺点：

1暴露了聚合类的内部表示，使其数据不安全；

2增加了客户的负担。

“迭代器模式”能较好地克服以上缺点，它在客户访问类与聚合类之间插入一个迭代器，这分离了聚合对象与其遍历行为，对客户也隐藏了其内部细节，且满足“单一职责原则”和“开闭原则”，

### **8.1 定义：**

​		（遍历）提供一个对象来顺序访问聚合对象中的一系列数据，而**不暴露聚合对象的内部表示**。迭代器模式是一种对象行为型模式

### 8.**2 **结构：

- **抽象聚合（Aggregate）角色：**定义存储、添加、删除聚合对象以及创建迭代器对象的接口。
- **具体聚合（ConcreteAggregate）角色：**实现抽象聚合类，返回一个具体迭代器的实例。
- **抽象迭代器（Iterator）角色：**定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法。
- **具体迭代器（Concretelterator）角色：**实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。 
- ![image-20211225233157902](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225233157902.png)

### 8.3 优缺点

**优点**

​	1访问一个聚合对象的内容而**无须暴露它的内部**表示。

​	2遍历任务交由**迭代器完成**，这简化了聚合类。

​	3它支持以不同方式**遍历一个聚合**，甚至可以自定义迭代器的**子类以支持新的遍历**。

​	4增加**新的聚合类和迭代器类都很方便**，无须修改原有代码。

​	5**封装性良好，为遍历不同的聚合结构提供一个统一的接口**。

**缺点**

​	增加了类的个数，这在一定程度上**增加了系统的复杂性。**

### 8.4使用场景

- 当需要为聚合对象提供**多种遍历方式**时。

- 当需要为遍历不同的聚合结构提供一个统一的接口时。

- 当访问一个聚合对象的内容而无须暴露其内部细节的表示时。

### 8.5 JDk源码

![image-20211225235404038](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225235404038.png)



![image-20211225235522117](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225235522117.png)

![image-20211225235926084](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225235926084.png)



![image-20211225235950539](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211225235950539.png)



## 9.访问者模式  visitor

​		在现实生活中，有些集合对象存在多种不同的元素，且每种元素也存在多种不同的访问者和处理方式。例如，公园中存在多个景点，也存在多个游客，不同的游客对同一个景点的评价可能不同；医院医生开的处方单中包含多种药元素，査看它的划价员和药房工作人员对它的处理方式也不同，划价员根据处方单上面的药品名和数量进行划价，药房工作人员根据处方单的内容进行抓药。  

### 9.1定义：

​		**封装**一些作用于**某种数据结构**中的各元素的**操作**，它可以在不改变这个数据结构的前提下定义作用于这些元素的**新的操作**。

![image-20211226141935418](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211226141935418.png)

### 9.2 结构

1. **抽象访问者（Visitor）角色：**定义一个访问具体元素的接口，为每个**具体元素类对应一个访问操作 visit()** ，该操作中的参数类型标识了被访问的具体元素。访问者模式要求**元素类的个数不能改变**
2. **具体访问者（ConcreteVisitor）角色：**实现抽象访问者角色中声明的各个访问操作，确定**访问者访问一个元素时该做什么。**
3. **抽象元素（Element）角色：**声明一个包含**接受操作 accept() 的接口**，被接受的访问者对象作为 accept() 方法的参数。定义每个元素可用被访问者访问
4. **具体元素（ConcreteElement）角色：**实现抽象元素角色提供的 accept() 操作，其方法体通常都是 visitor.visit(this) ，另外具体元素中可能还包含本身业务逻辑的相关操作。
5. **对象结构（Object Structure）角色：**是一个**包含元素角色的容器**，提供让访问者对象遍历容器中的所有元素的方法，通常由 List、Set、Map 等聚合类实现。

【例】给宠物喂食
现在养宠物的人特别多，我们就以这个为例，当然宠物还分为狗，猫等，要给宠物喂食的话，主人可以喂，其他人也可以喂食。

- 访问者角色:给宠物喂食的人

- 具体访问者角色:主人、其他人

- 抽象元素角色:动物抽象类

- 具体元素角色:宠物狗、宠物猫

- 结构对象角色:主人家

  ![image-20211226142658874](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211226142658874.png)

### 9.3 优缺点

#### **优点**

​	1**扩展性好。**能够在**不修改对象结构**中的元素的情况下，为对象结构中的**元素添加新的功能**。

​	2**复用性好。**可以通过访问者来定义整个对象结构通用的功能，从而提高系统的复用程度。

​	3**灵活性好。**访问者模式将数据结构与作用于结构上的操作解耦，使得操作集合可相对自由地演化而不影响系统的数据结构。

​	4**符合单一职责原则**。访问者模式把相关的行为封装在一起，构成一个访问者，使每一个访问者的功能都比较单一。

#### **缺点**

​	1增加**新的元素类很困难**。在访问者模式中，每增加一个新的元素类，都要在每一个具体访问者类中增加相应的具体操作，**这违背了“开闭原则”**。

​	2破坏封装。访问者模式中**具体元素对访问者公布细节**，这破坏了对象的封装性。

​	3**违反了依赖倒置原则**。**访问者模式依赖了具体类**，而没有依赖抽象类。

### 9.4使用场景

访问者模式包含以下主要角色。

当系统中存在类型数量稳定（固定）的一类数据结构时，可以使用访问者模式方便地实现对该类型所有数据结构的不同操作，而又不会对数据产生任何副作用（脏数据）。

 简而言之，就是当对集合中的不同类型数据（类型数量稳定）进行多种操作时，使用访问者模式。

### 9.5扩展

访问者模式用到一种双分派

#### **1，分派:**

变量被声明时的类型叫做变量的静态类型，有些人又把静态类型叫做明显类型;而变量所引用的对象的真实类型又叫做变量的实际类型。比如Map map = new HashMap() , **map变量的静态类型是 Map，实际类型是(Hashwap**。根据对象的类型而对方法进行的选择，就是分派(Dispatch)，分派(Dispatch)又分为两种，即静态分派和动态分派。

**静态分派(static Dispatch)**发生在**编译时期**，分派根据静态类型信息发生。静态分派对于我们来说并不陌生，方法重载就是静态分派。

**动态分派(Dynamic Dispatch)**发生在**运行时期**，动态分派动态地置换掉某个方法。Java通过方法的重写支持动态分派。

#### **2，动态分派:**

通过方法的重写支持动态分派。

```java
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
```

上面代码的结果大家应该直接可以说出来，这不就是多态吗!运行执行的是子类中的方法。

Java编译器在编译时期并不总是知道哪些代码会被执行，因为编译器仅仅知道对象的静态类型，而不知道对象的真实类型;而方法的调用则是根据对象的真实类型，而不是静态类型。

#### **3, 静态分派：**

通过方法重载支持静态分派

```java
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
```

![image-20211226153359059](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211226153359059.png)

这个结果可能出乎一些人的意料了，为什么呢?
**重载方法的分派是根据静态类型进行的，这个分派过程在编译时期就完成了。**

#### 5，双分派

所谓双分派技术就是在选择一个方法的时候，不仅仅要根据消息接收者(receiver)的运行时区别，还要根据参数的运行时区别。

```java
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
```

​		

​		在上面代码中，客户端将Execute对象做为参数传递给Animal类型的变量调用的方法，这里完成第一次分派，这里是方法重写，所以是动态分派，也就是执行实际类型中的方法，同时也将自己this作为参数传递进去，这里就完成了第二次分派，这里的**Execute类中有多个重载的方法，而传递进行的是this**，就是具体的实际类型的对象。

​		说到这里，我们已经明白双分派是怎么回事了，但是它有什么效果呢?就是可以实现方法的动态绑定，我们可以对上面的程序进行修改。运行结果如下:

![image-20211226154625933](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211226154625933.png)



**双分派实现动态绑定的本质，就是在重载方法委派的前面加上了继承体系中覆盖的环节，由于覆盖是动态的，所以重载就是动态的了。**



## 10.备忘录模式 memento

​		每个人都有犯错误的时候，都希望有种“后悔药”能弥补自己的过失，让自己重新开始，但现实是残酷的。在计算机应用中，客户同样会常常犯错误，能否提供“后悔药”给他们呢？当然是可以的，而且是有必要的。这个功能由“备忘录模式”来实现。
  其实很多应用软件都提供了这项功能，如 Word、记事本、Photoshop、Eclipse 等软件在编辑时按 Ctrl+Z 组合键时能撤销当前操作，使文档恢复到之前的状态；还有在 IE 中的后退键、数据库事务管理中的**回滚操作、玩游戏时的中间结果存档功能**、数据库与操作系统的备份操作、棋类游戏中的悔棋功能等都属于这类。
   备忘录模式能记录一个对象的内部状态，**当用户后悔时能撤销当前操作，使数据恢复到它原先的状态**。

![image-20211226155439775](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211226155439775.png)

### **10.1 定义：**

**在不破坏封装性的前提下，**捕获一个**对象的内部状态**，并在该对象之外保存这个状态，以便以后**当需要时能将该对象恢复到原先保存的状态**。该模式又叫快照模式。

### 10.2 结构:

- **发起人（Originator）角色：**记录**当前时刻**的内部状态信息，**提供创建备忘录**和**恢复备忘录数据**的功能，实现其他业务功能，它可以访问备忘录里的所有信息。

- **备忘录（Memento）角色：**负责**存储发起人的内部状态**，在需要的时候提供这些内部状态给发起人。

- **管理者（Caretaker）角色：**对备忘录进行管理，提供保存与获取备忘录的功能，但其**不能对备忘录的内容进行访问与修改。**

  备忘录有两个等效的接口:

  - **窄接口:**管理者(Caretaker)对象(和其他发起人对象之外的任何对象）看到的是备忘录的窄接口(nastar Interface)，这个窄接口**只允许他把备忘录对象传给其他的对象。**
  - **宽接口:**与管理者看到的窄接口相反，发起人对象可以看到一个宽接口(wide Interface)，这个宽接口允许它读取所有的数据，以便根据这些数据**恢复这个发起人对象的内部状态。**



#### 白箱备忘录模式

![image-20211226155421646](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211226155421646.png)

 ![image-20211226155549344](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211226155549344.png)



分析∶白箱备忘录模式是**破坏封装性的**。但是通过程序员自律，同样可以在一定程度上实现模式的大部分用意。



#### 黑箱备忘录模式（隐藏备忘录）

![image-20211226161738716](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211226161738716.png)

![image-20211226162135006](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211226162135006.png)



```java
/**
 * @author wxl
 * @version 1.0
 * @description: 游戏角色 发起人角色
 * @date 2021/12/26 15:57
 */
public class GameRole {

    private int hp;

    private int atk;

    private int def;

    public void initState(){
        this.hp = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight(){
        this.hp = 0;
        this.atk = 0;
        this.def = 0;
    }

    public RoleStateMemento saveState() {
        return new RoleStateMemento(this.hp,this.atk,this.def);
    }

    public void recoverState(Memento memento){
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        this.hp = roleStateMemento.getHp();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    public void stateDisplay() {
        System.out.println("hp" + hp);
        System.out.println("atk" + atk);
        System.out.println("def" + def);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    private class RoleStateMemento implements Memento{
        private int hp;

        private int atk;

        private int def;

        public RoleStateMemento() {
        }

        public RoleStateMemento(int hp, int atk, int def) {
            this.hp = hp;
            this.atk = atk;
            this.def = def;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }
    }
}
```



### 10.3 优缺点

**优点**

​	1提供了一种可以**恢复状态的机制**。当用户需要时能够比较方便地将数据恢复到某个历史的状态。

​	2实现了**内部状态的封装**。除了创建它的发起人之外，其他对象都不能够访问这些状态信息。

​	3简化了发起人类。发起人**不需要管理和保存其内部状态的各个备份**，所有状态信息都保存在备忘录中，并由管理者进行管理，这**符合单一职责原则**。

**缺点**

**资源消耗大。**如果要保存的内部状态信息过多或者特别频繁，将会占用比较大的内存资源。

### 10.4使用场景

1. 需要保存与恢复数据的场景，如玩游戏时的中间结果的存档功能。

2. 需要提供一个可回滚操作的场景，如 Word、记事本、Photoshop，Eclipse 等软件在编辑时按 Ctrl+Z 组合键，还有**数据库中事务操作**。

### 10.5模式的扩展

在前面介绍的备忘录模式中，有单状态备份的例子，也有多状态备份的例子。下面介绍备忘录模式如何同[原型模式](http://c.biancheng.net/view/1343.html)混合使用。在备忘录模式中，通过定义“备忘录”来备份“发起人”的信息，而原型模式的 clone() 方法具有自备份功能，所以，如果让发起人实现 Cloneable 接口就有备份自己的功能，这时可以删除备忘录类，其结构图如图 4 所示。

![image-20211226163942434](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211226163942434.png)

## 11.解释器模式 interprete

 		在软件开发中，会遇到有些问题多次重复出现，而且有一定的相似性和规律性。如果将它们归纳成一种简单的语言，那么这些问题实例将是该语言的一些句子，这样就可以用“编译原理”中的解释器模式来实现了。

 虽然使用解释器模式的实例不是很多，但对于满足以上特点，且对运行效率要求不是很高的应用实例，如果用解释器模式来实现，其效果是非常好的，本文将介绍其工作原理与使用方法。

```java
public static int add(int i, int j){
    return i + j;
}
public static int add(int i, int j, int k){
    return i + j + k;
}
public static int add(Integer ... arr){
    int sum = 0;
    for (Integer integer : arr) {
        sum += integer;
    }
    return sum;
}
```



​	上面的形式比较单一、有限，如果形式变化非常多，这就不符合要求，因为加法和减法运算，两个运算符与数值可以有无限种组合方式。比如合法1+2+3+4+5、1+2+3-4

不合法 1++++3等等。

显然，现在需要一种**翻译识别机器**，能够解析由数字以及*+–符号构成的合法的运算序列。如果把运算符和数字都看作节点的话，能够逐个节点的进行读取解析运算，这就是解释器模式的思维。

### 11.1定义

​		给定一个语言，**定义它的文法表示**，**并定义一个解释器**，这个解释器使用该标识来解释语言中的句子。

在解释器模式中，我们需要将待解决的问题，提取出规则，抽象为一种“语言”。比如加减法运算，规则为：由数值和+-符号组成的合法序列，“1+3-2” 就是这种语言的句子。

解释器就是要解析出来语句的含义。但是如何描述规则呢？

文法是用于描述语言的语法结构的形式规则。

```
expression ::= value | plus | minus

plus ::= expression ‘+’ expression  

minus ::= expression ‘-’ expression  

value ::= integer
```

*注意： 这里的符号“::=”表示“定义为”的意思，竖线 | 表示或，左右的其中一个，引号内为字符本身，引号外为语法。*

上面规则描述为 ：

表达式可以是一个值，也可以是plus或者minus运算，而plus和minus又是由表达式结合运算符构成，值的类型为整型数。

**抽象语法树：**

在计算机科学中，抽象语法树（AbstractSyntaxTree，AST），或简称语法树（Syntax tree），是源代码语法结构的一种抽象表示。它以树状的形式表现编程语言的语法结构，树上的每个节点都表示源代码中的一种结构。

用树形来表示符合文法规则的句子。

‘1+2+3+4-5’

 ![image-20211226165547832](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211226165547832.png)               

### 11.2 结构

解释器模式包含以下主要角色。

‘1+2/3-4’

1. **抽象表达式（Abstract Expression）角色：**定义**解释器的接口**，约定解释器的解释操作，主要包含解释方法 interpret()。

2. **终结符表达式（Terminal Expression）角色**：是**抽象表达式的子类**，用来实现文法中与终结符相关的操作，文法中的每一个终结符都有一个具体终结表达式与之相对应。**例如1，2，3，4**

3. **非终结符表达式（Nonterminal Expression）角色：**也是抽象表达式的子类，用来实现文法中与非终结符相关的操作，文法中的**每条规则**都对应于一个非终结符表达式。**例如+，-，/**

4. **环境（Context）角色：**通常包含各个解释器**需要的数据或是公共的功能**，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值。**存储**

   

5. **客户端（Client）：**主要任务是将需要分析的句子或表达式**转换成**使用解释器对象描述的**抽象语法树**，然后调用解释器的解释方法，当然也可以通过环境角色间接访问解释器的解释方法。

![image-20211226170146409](C:/Users/DELL/AppData/Roaming/Typora/typora-user-images/image-20211226170146409.png)





### 11.3 优缺点

1 **优点**：

- 易于改变和扩展文法。

  由于在解释器模式中**使用类来表示语言的文法规则**，因此可以通过继承等机制来改变或扩展文法。每一条文法规则都可以表示为一个类，因此可以方便地实现一个简单的语言。

- 实现文法较为容易。

  在抽象语法树中每一个表达式节点类的实现方式都是相似的，这些类的代码编写都不会特别复杂。

- 增加新的解释表达式较为方便。

  如果用户**需要增加新的解释表达式只需要对应增加一个新的终结符表达式或非终结符表达式类**，原有表达式类代码无须修改，**符合 "开闭原则"**。

2 **缺点**：

- 对于复杂文法难以维护。

  在解释器模式中，每一条规则至少需要定义一个类，因此如果一个语言包含太多文法规则，**类的个数将会急剧增加**，**导致系统难以管理和维护**。

- 执行效率较低。

  由于在**解释器模式中使用了大量的循环和递归调用**，因此在**解释较为复杂的句子时其速度很慢**，而且代码的调试过程也比较麻烦。

### 11.4使用场景

- 当语言的文法**较为简单，且执行效率不是关键问题**时。

- 当问题重复出现，且可以用一种简单的语言来进行表达时。

- 当一个语言**需要解释执行**，并且**语言中的句子可以表示为一个抽象语法树**的时候。























# 总结

| 分类                                              | 设计模式                                      | 简述                                                         | 一句话归纳                     | 目的                   | 生活案例       |
| ------------------------------------------------- | --------------------------------------------- | ------------------------------------------------------------ | ------------------------------ | ---------------------- | -------------- |
|                                                   | 工厂模式（Factory Pattern）                   | 不同条件下创建不同实例                                       | 产品标准化，生产更高效         | 封装创建细节           | 实体工厂       |
| 创建型设计模式<br/>（简单来说就是用来创建对象的） | 单例模式（Singleton Pattern）                 | 保证一个类仅有一个实例，并且提供一个全局访问点               | 世上只有一个我                 | 保证独一无二           | CEO            |
|                                                   | 原型模式（Prototype Pattern）                 | 通过拷贝原型创建新的对象                                     | 拔一根猴毛，吹出千万个         | 高效创建对象           | 克隆           |
|                                                   | 建造者模式（Builder Pattern）                 | 用来创建复杂的复合对象                                       | 高配中配和低配，想选哪配就哪配 | 开放个性配置步骤       | 选配           |
|                                                   |                                               |                                                              |                                |                        |                |
|                                                   |                                               |                                                              |                                |                        |                |
|                                                   |                                               |                                                              |                                |                        |                |
|                                                   |                                               |                                                              |                                |                        |                |
|                                                   |                                               |                                                              |                                |                        |                |
|                                                   |                                               |                                                              |                                |                        |                |
|                                                   | 代理模式（Proxy Pattern）                     | 为其他对象提供一种代理以控制对这个对象的访问                 | 没有资源没时间，得找别人来帮忙 | 增强职责               | 媒婆           |
| 结构型设计模式<br/>（关注类和对象的组合）         | 外观模式（Facade Pattern）                    | 对外提供一个统一的接口用来访问子系统                         | 打开一扇门，通向全世界         | 统一访问入口           | 前台           |
|                                                   | 装饰器模式（Decorator Pattern）               | 为对象添加新功能                                             | 他大舅他二舅都是他舅           | 灵活扩展、同宗同源     | 煎饼           |
|                                                   | 享元模式（Flyweight Pattern）                 | 使用对象池来减少重复对象的创建                               | 优化资源配置，减少重复浪费     | 共享资源池             | 全国社保联网   |
|                                                   | 组合模式（Composite Pattern）                 | 将整体与局部（树形结构）进行递归组合，让客户端能够以一种的方式对其进行处理 | 人在一起叫团伙，心在一起叫团队 | 统一整体和个体         | 组织架构树     |
|                                                   | 适配器模式（Adapter Pattern）                 | 将原来不兼容的两个类融合在一起                               | 万能充电器                     | 兼容转换               | 电源适配       |
|                                                   | 桥接模式（Bridge Pattern）                    | 将两个能够独立变化的部分分离开来                             | 约定优于配置                   | 不允许用继承           | 桥             |
|                                                   |                                               |                                                              |                                |                        |                |
|                                                   |                                               |                                                              |                                |                        |                |
|                                                   |                                               |                                                              |                                |                        |                |
|                                                   |                                               |                                                              |                                |                        |                |
|                                                   |                                               |                                                              |                                |                        |                |
|                                                   |                                               |                                                              |                                |                        |                |
|                                                   |                                               |                                                              |                                |                        |                |
|                                                   |                                               |                                                              |                                |                        |                |
| 行为型设计模式<br/>（关注对象之间的通信           | 模板模式（Template Pattern）                  | 定义一套流程模板，根据需要实现模板中的操作                   | 流程全部标准化，需要微调请覆盖 | 逻辑复用               | 把大象装进冰箱 |
|                                                   | 策略模式（Strategy Pattern）                  | 封装不同的算法，算法之间能互相替换                           | 条条大道通罗马，具体哪条你来定 | 把选择权交给用户       | 选择支付方式   |
|                                                   | 责任链模式（Chain of Responsibility Pattern） | 拦截的类都实现统一接口，每个接收者都包含对下一个接收者的引用。将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。 | 各人自扫门前雪，莫管他们瓦上霜 | 解耦处理逻辑           | 踢皮球         |
|                                                   | 迭代器模式（Iterator Pattern）                | 提供一种方法顺序访问一个聚合对象中的各个元素                 | 流水线上坐一天，每个包裹扫一遍 | 统一对集合的访问方式   | 逐个检票进站   |
|                                                   | 命令模式（Command Pattern）                   | 将请求封装成命令，并记录下来，能够撤销与重做                 | 运筹帷幄之中，决胜千里之外     | 解耦请求和处理         | 遥控器         |
|                                                   | 状态模式（State Pattern）                     | 根据不同的状态做出不同的行为                                 | 状态驱动行为，行为决定状态     | 绑定状态和行为         | 订单状态跟踪   |
|                                                   | 备忘录模式（Memento Pattern）                 | 保存对象的状态，在需要时进行恢复                             | 失足不成千古恨，想重来时就重来 | 备份、后悔机制         | 草稿箱         |
|                                                   | 中介者模式（Mediator Pattern）                | 将对象之间的通信关联关系封装到一个中介类中单独处理，从而使其耦合松散 | 联系方式我给你，怎么搞定我不管 | 统一管理网状资源       | 朋友圈         |
|                                                   | 解释器模式（Interpreter Pattern）             | 给定一个语言，定义它的语法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子 | 我想说”方言“，一切解释权都归我 | 实现特定语法解析       | 摩斯密码       |
|                                                   | 观察者模式（Observer Pattern）                | 状态发生改变时通知观察者，一对多的关系                       | 到点就通知我                   | 解耦观察者与被观察者   | 闹钟           |
|                                                   | 访问者模式（Visitor Pattern）                 | 稳定数据结构，定义新的操作行为                               | 横看成岭侧成峰，远近高低各不同 | 解耦数据结构和数据操作 | KPI考核        |
|                                                   | 委派模式（Delegate Pattern）                  | 允许对象组合实现与继承相同的代码重用，负责任务的调用和分配   | 这个需求很简单，怎么实现我不管 | 只对结果负责           | 授权委托书     |

