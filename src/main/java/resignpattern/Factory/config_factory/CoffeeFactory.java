package resignpattern.Factory.config_factory;


import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

//用反射解决工厂出现if过多的代码繁杂的情况
public class CoffeeFactory {

    private static HashMap<String, Coffee> hashMap = new HashMap<String,Coffee>();

    static {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            Set<Object> keys = p.keySet();
            for (Object key : keys){
                String className = p.getProperty((String) key);
                Class<?> claxx = Class.forName(className);
                Coffee coffee = (Coffee) claxx.newInstance();
                hashMap.put((String)key,coffee);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能描述:
     * @Description:根据名称获取对象
     * @Date: 2021/12/23 21:09
     * @Param:
     * @return:
     **/
    public static Coffee createCoffee(String type){
        return hashMap.get(type);
    }

}
