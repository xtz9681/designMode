package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * desc
 *代理模式
 * 动态代理
 * 每一个动态代理类都必须要实现InvocationHandler这个接口，并且每个代理类的实例都关联到了一个handler，
 * 当我们通过代理对象调用一个方法的时候，
 * 这个方法的调用就会被转发为由InvocationHandler这个接口的 invoke 方法来进行调用
 * @author xutianzhe
 * @Date 2018/8/29
 **/
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;

    public DynamicProxyHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前的准备");
        Object result = method.invoke(object,args);
        System.out.println("买房后的手续");
        return result;
    }
}
