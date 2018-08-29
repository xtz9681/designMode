package proxy.dynamicproxy;

import proxy.staticproxy.BuyHouse;
import proxy.staticproxy.BuyHouseImpl;

import java.lang.reflect.Proxy;

/**
 * desc
 *代理模式
 * 动态代理
 * @author xutianzhe
 * @Date 2018/8/29
 **/
public class DynamicProxyTest {
    public static void main(String[] args){
        BuyHouse buyHouse = new BuyHouseImpl();
        //Proxy这个类的作用就是用来动态创建一个代理对象的类
        BuyHouse buyHouseProxy = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader()
                ,buyHouse.getClass().getInterfaces(),new DynamicProxyHandler(buyHouse));
        buyHouseProxy.buyHouse();
    }
}
