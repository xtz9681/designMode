package memento;

/**
 * desc
 *备忘录模式
 * 管理者类（角色状态管理者）
 * @author xutianzhe
 * @Date 2018/9/28
 **/
public class PlayerStateManager {
    private PlayerStateMemento memento;

    public PlayerStateMemento getMemento() {
        return memento;
    }

    public void setMemento(PlayerStateMemento memento) {
        this.memento = memento;
    }
}
