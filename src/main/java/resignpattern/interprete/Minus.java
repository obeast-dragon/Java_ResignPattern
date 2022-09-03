package resignpattern.interprete;

/**
 * @author wxl
 * @version 1.0
 * @description: 减法  非终结表达式类
 * @date 2021/12/26 19:12
 */
public class Minus extends AbstractExpression{

    private AbstractExpression left;

    private AbstractExpression right;


    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        //将左边表达式结果和右边表达式结果进行相减
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString()+" - " + right.toString() + ")";
    }
}
