package observer;

/**
 * desc
 *观察者模式
 *通知者接口
 * @author xutianzhe
 * @Date 2018/9/11
 **/
public interface Informer {
    void addTheObserved(Observer o);
    void deleteTheObserved(Observer o);
    void notifyTheObserved();
}
