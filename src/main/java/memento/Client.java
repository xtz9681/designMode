package memento;

/**
 * desc
 *备忘录模式
 * 客户端
 * @author xutianzhe
 * @Date 2018/9/28
 **/
public class Client {
    /**
     * 在系统中需要实现撤销功能，那么便可以使用备忘录模式来存储可撤销的状态。
     * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在对象之外保存
     * 这个状态。这样以后就可以将该对象恢复到原先的保存的状态
     * @param args
     */
    public static void main(String[] args){
        Player trent = new Player();
        trent.initState();
        System.out.println(trent.toString());

        PlayerStateManager manager = new PlayerStateManager();
        manager.setMemento(trent.saveState());

        trent.fight();
        System.out.println(trent.toString());

        trent.recoveState(manager.getMemento());
        System.out.println(trent.toString());
    }
}
