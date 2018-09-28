package memento;

/**
 * desc
 *客户端模式
 * 发起人类（玩家对象类）
 * @author xutianzhe
 * @Date 2018/9/28
 **/
public class Player {
    private int health;
    private int attack;
    private int defense;

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

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }

    public void initState(){
        this.health = 100;
        this.attack = 100;
        this.defense = 100;
    }

    public void fight(){
        this.health = 0;
        this.attack = 0;
        this.defense = 0;
    }

    public PlayerStateMemento saveState(){
        return new PlayerStateMemento(health,attack,defense);
    }

    public void recoveState(PlayerStateMemento memento){
        this.health = memento.getHealth();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }
}
