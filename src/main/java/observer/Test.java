package observer;

/**
 * desc
 *观察者模式
 * 客户端
 * @author xutianzhe
 * @Date 2018/9/11
 **/
public class Test {
    /**
     * 很多时候，观察者可能是一些完全风马牛不相及的对象，要将他放入一个具体通知者的通知列表中，必须继承一个共同的Observer类
     * 这样就可以让这些观察者对象有了共性，放入observers中。
     * 当一个对象状态发生改变需要改变其他对象的时候需要使用到观察者模式
     * 观察者模式将通知者类与观察者类通过抽象分离了开来，双方无论谁发生了改变，都不会影响到另一方
     * @param args
     */
    public static void main(String[] args){
        Observer zhangsan = new User("张三","玩手机ing~");
        Observer lisi = new User("李四","看NBA中~");
        Observer wangwu = new User("王五","玩手机ing~");
        System.out.println("----------------------------------");

        InformerServer informer = new InformerServer();
        informer.addTheObserved(zhangsan);
        informer.addTheObserved(lisi);
        informer.addTheObserved(wangwu);

        informer.deleteTheObserved(wangwu);

        if (true) {
            System.out.println("咳咳，我回来了");
            informer.setUpdate("老板回来了！");
            System.out.println("----------------------------------");
        }
    }
}
