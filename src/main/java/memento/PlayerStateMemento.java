package memento;

/**
 * desc
 *备忘录模式
 * 备忘录类（角色状态存储箱）
 * @author xutianzhe
 * @Date 2018/9/28
 **/
public class PlayerStateMemento {
    private int health;
    private int attack;
    private int defense;

    public PlayerStateMemento(int health, int attack, int defense) {
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
