package singleton;

/**
 * desc
 *单例模式
 * 懒汉式，线程不安全
 * @author xutianzhe
 * @Date 2018/10/10
 **/
public class Singleton1 {
    private static Singleton1 instance;

    /**
     * 用private修饰构造方法，堵死外界利用new创建此类实例
     */
    private Singleton1(){}

    /**
     * 获得本类实例的唯一访问方法
     * @return
     */
    public static Singleton1 getInstance(){
        //若实例不存在，则new一个新实例，否则返回已有实例
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
