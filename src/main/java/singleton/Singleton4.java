package singleton;

/**
 * desc
 *双重校验锁
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能
 * @author xutianzhe
 * @Date 2018/10/10
 **/
public class Singleton4 {
    private volatile static Singleton4 instance;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if (instance == null){
            synchronized (Singleton4.class){
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
