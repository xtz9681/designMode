package command;

/**
 * desc
 *命令模式
 * 抽象命令类
 * @author xutianzhe
 * @Date 2019/1/11
 **/
public abstract class Command {
    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer){
        this.barbecuer = barbecuer;
    }

    abstract public void excuteCommand();
}
