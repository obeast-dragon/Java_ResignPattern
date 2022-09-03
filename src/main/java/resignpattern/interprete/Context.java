package resignpattern.interprete;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wxl
 * @version 1.0
 * @description: 环境角色
 * @date 2021/12/26 18:59
 */
public class Context {

    //定义一个map集合，用来存储变量急对应的值
    private Map<Variable, Integer> map = new HashMap<>();

    //
    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    public int getValue(Variable var){
        return map.get(var);
    }

}
