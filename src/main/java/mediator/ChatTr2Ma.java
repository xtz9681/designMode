package mediator;

/**
 * desc
 *中介者模式
 * 具体中介者类（聊天室类）
 * @author xutianzhe
 * @Date 2019/2/14
 **/
public class ChatTr2Ma extends ChatTool{
    private UserTrent trent;
    private UserMary mary;

    public UserTrent getTrent() {
        return trent;
    }

    public void setTrent(UserTrent trent) {
        this.trent = trent;
    }

    public UserMary getMary() {
        return mary;
    }

    public void setMary(UserMary mary) {
        this.mary = mary;
    }

    @Override
    public void send(String message, User user) {
        if (user.equals(trent)){
            mary.getMessage(message);
        }else {
            trent.getMessage(message);
        }
    }
}
