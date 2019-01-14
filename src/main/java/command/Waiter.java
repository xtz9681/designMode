package command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * desc
 *命令模式
 * 命令者类
 * @author xutianzhe
 * @Date 2019/1/11
 **/
public class Waiter {
    private List<Command> order = new ArrayList<Command>();

    public void setOrder(Command command){
        order.add(command);
        System.out.println("加一份"+command.toString()+" 时间："+new Date());
    }

    public void cancelOrder(Command command){
        order.remove(command);
        System.out.println("减一份"+command.toString()+" 时间："+new Date());
    }

    public void inform(){
        for (Command command:order){
            command.excuteCommand();
        }
    }
}
