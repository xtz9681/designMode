package observer;

/**
 * desc
 *观察者模式
 * 观察者类
 * @author xutianzhe
 * @Date 2018/9/11
 **/
public class User implements Observer{
    private String name;

    public User(String name,String status) {
        this.name = name;
        System.out.println(name+status);
    }

    public void update(String msg) {
        System.out.println(name+"收到消息！");
        System.out.println(name+"工作ing~");
    }
}
