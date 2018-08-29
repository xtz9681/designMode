package proxy.staticproxy;

/**
 * desc
 * 代理模式
 * 静态代理
 * @author xutianzhe
 * @Date 2018/8/29
 **/
public class ProxyTest {
    public static void main(String[] args){
        /**
         *首先申明实现类（我要买房），然后让代理类去实现这个方法.
         * 但其实静态代理并不实用，动态代理才比较实用。
         * 比如spring中的aop（面向切面）就是动态代理的实际运用例子
         **/
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouseProxy proxy = new BuyHouseProxy(buyHouse);
        proxy.buyHouse();
    }
}
