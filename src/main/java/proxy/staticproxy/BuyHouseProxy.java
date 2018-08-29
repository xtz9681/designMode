package proxy.staticproxy;

/**
 * desc
 *代理模式
 * 静态代理
 * 代理类
 * @author xutianzhe
 * @Date 2018/8/29
 **/
public class BuyHouseProxy implements BuyHouse {

    private BuyHouse buyHouse;

    public BuyHouseProxy(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    public void buyHouse() {
        System.out.println("买房前的准备");
        buyHouse.buyHouse();
        System.out.println("买房后的手续");
    }
}
