package command;

/**
 * desc
 *命令模式
 * 具体命令类2
 * @author xutianzhe
 * @Date 2019/1/11
 **/
public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void excuteCommand() {
        barbecuer.bakeMutton();
    }
}
