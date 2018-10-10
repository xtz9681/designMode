package singleton;

/**
 * desc
 * 单例模式
 *饿汉式，线程安全
 * 优点：没有加锁，执行效率提高
 * 缺点：类加载时就会初始化，浪费内存
 * @author xutianzhe
 * @Date 2018/10/10
 **/
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return instance;
    }
}
