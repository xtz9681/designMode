package adapter;

/**
 * desc
 *适配器模式
 * 客户端
 * @author xutianzhe
 * @Date 2018/9/28
 **/
public class Client {
    /**
     * 当你需要重用一些接口或者类的方法是可以使用适配器模式
     * 客户端不需要知道这个方法是从哪个适配者上调用的
     * 只需要调用适配器的方法即可。
     * 修改时只需要修改适配器类的方法就好
     * @param args
     */
    public static void main(String[] args){
        Target target = new Adapter();
        target.request1();
        target.request2();
    }
}
