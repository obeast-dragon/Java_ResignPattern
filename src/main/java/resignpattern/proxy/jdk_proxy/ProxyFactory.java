package resignpattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wxl
 * @version 1.0
 * @description: 获取代理对象的工厂类 生产代理中介
 *      代理类也实现了对应的接口
 * @date 2021/12/24 10:03
 */
public class ProxyFactory {
    //由JDK生成代理类
    //然后通过放射调用方法
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
