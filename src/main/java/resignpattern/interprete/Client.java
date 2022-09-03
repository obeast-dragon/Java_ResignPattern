package resignpattern.interprete;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/26 19:22
 */
public class Client {
    public static void main(String[] args) {
        //创建环境变量
        Context context = new Context();

        //创建多个变量对象
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");


        //将变量存储到环境角色中
        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);

        //换取抽象语法树   a + b - c + d
//        AbstractExpression expression = new Plus(a, new Plus(new Minus(b, c), d));
        //换取抽象语法树   a * b - c - d
        AbstractExpression expression = new Minus(new Minus(new Ride(a, b), c), d);
        int result = expression.interpret(context);
        System.out.println(expression + "=" + result);


    }
}
