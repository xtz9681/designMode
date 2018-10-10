package singleton;

/**
 * desc
 *单例模式
 * 懒汉式，线程安全
 * 优点：第一次调用才初始化，避免了资源浪费
 * 缺点：必须加锁synchronized，才能保证单例，影响效率
 * @author xutianzhe
 * @Date 2018/10/10
 **/
public class Singleton2 {
    private static Singleton2 instance;

    /**
     * 用private修饰构造方法，堵死外界利用new创建此类实例
     */
    private Singleton2(){}

    /**
     * 获得本类实例的唯一访问方法
     * 增加线程安全。synchronized
     * @return
     */
    public static synchronized Singleton2 getInstance(){
        //若实例不存在，则new一个新实例，否则返回已有实例
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
