package adapter;

/**
 * desc
 *适配器模式
 * 适配器类
 * @author xutianzhe
 * @Date 2018/9/28
 **/
public class Adapter implements Target {
    private Adaptee1 adaptee1 = new Adaptee1();
    private Adaptee2 adaptee2 = new Adaptee2();

    public void request1() {
        adaptee1.request1();
        //增加一些功能
    }

    public void request2() {
        adaptee2.request2();
        //增加一些功能
    }
}
