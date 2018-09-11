package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * desc
 *观察者模式
 * 通知者具体实现类
 * @author xutianzhe
 * @Date 2018/9/11
 **/
public class InformerServer implements Informer {
    private List<Observer> observers;
    private String msg;
    public InformerServer(){
        observers = new ArrayList<Observer>();
    }
    public void addTheObserved(Observer o) {
        observers.add(o);
    }

    public void deleteTheObserved(Observer o) {
        if (!observers.isEmpty()){
            observers.remove(o);
        }
    }

    public void notifyTheObserved() {
        for (int i = 0; i < observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(msg);
        }
    }

    public void setUpdate(String msg){
        this.msg = msg;
        System.out.println("发现有动态更新："+msg);
        notifyTheObserved();
    }
}
