package mediator;

/**
 * desc
 *中介者模式
 * 抽象中介类（聊天软件类）
 * @author xutianzhe
 * @Date 2019/2/14
 **/
public abstract class ChatTool {
    public abstract void send(String message,User user);
}
