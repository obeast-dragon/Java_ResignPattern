package resignpattern.interprete;

/**
 * @author wxl
 * @version 1.0
 * @description: 乘法  非终结表达式类
 * @date 2021/12/26 19:12
 */
public class Ride extends AbstractExpression{

    private AbstractExpression left;

    private AbstractExpression right;


    public Ride(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    //计算规则
    @Override
    public int interpret(Context context) {
        //将左边表达式结果和右边表达式结果进行相加
        return left.interpret(context) * right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString()+" * " + right.toString() + ")";
    }
}
