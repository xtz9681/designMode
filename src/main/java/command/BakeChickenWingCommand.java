package command;

/**
 * desc
 *命令模式
 * 具体命令类1
 * @author xutianzhe
 * @Date 2019/1/11
 **/
public class BakeChickenWingCommand extends Command{

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    public void excuteCommand() {
        barbecuer.bakeChickenWing();
    }
}
