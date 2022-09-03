package resignpattern.interprete;

/**
 * @author wxl
 * @version 1.0
 * @description: 封装变量的类 终结符表达式
 * @date 2021/12/26 19:10
 */
public class Variable extends AbstractExpression{


    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {

        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
