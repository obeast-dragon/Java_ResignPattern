//package resignpattern.proxy.cglib_proxy;
//
//import net.sf.cglib.proxy.Enhancer;
//import net.sf.cglib.proxy.MethodInterceptor;
//import net.sf.cglib.proxy.MethodProxy;
//
//import java.lang.reflect.Method;
//
///**
// * @author wxl
// * @version 1.0
// * @description: 代理对象工厂
// * @date 2021/12/24 12:52
// */
//public class ProxyFactory implements MethodInterceptor {
//
//    //通过CGLib生成抽象主题
//    private TrainStation station1 = new TrainStation();
//
//    public TrainStation getProxyObject(){
//        //创建Enhancer对象，类似JDK代理中的proxy类
//        Enhancer enhancer = new Enhancer();
//        //设置父类的字父类节码对象,指定
//        enhancer.setSuperclass(TrainStation.class);
//        //设置回调函数
//        enhancer.setCallback(this);
//
//        //创建代理对象
//        TrainStation proxyObject = (TrainStation) enhancer.create();
//        return proxyObject;
//    }
//
//    @Override
//    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        System.out.println("方法执行了");
//        System.out.println("CGLIB服务费");
//        Object invoke = method.invoke(station1, objects);
//        return invoke;
//    }
//}
