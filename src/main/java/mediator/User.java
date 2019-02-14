package mediator;

/**
 * desc
 *中介者模式
 * 抽象同事类
 * @author xutianzhe
 * @Date 2019/2/14
 **/
public abstract class User {
    protected ChatTool chatTool;

    public User(ChatTool chatTool) {
        this.chatTool = chatTool;
    }
}
