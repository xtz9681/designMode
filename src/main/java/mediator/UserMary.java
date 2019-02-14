package mediator;

/**
 * desc
 *中介者模式
 * 具体同事类（用户类）
 * @author xutianzhe
 * @Date 2019/2/14
 **/
public class UserMary extends User {
    public UserMary(ChatTool chatTool) {
        super(chatTool);
    }
    public void sendMessage(String message){
        chatTool.send(message,this);
    }

    public void getMessage(String message){
        System.out.println("Mary收到消息："+message);
    }

    public void showMessage(String message){
        System.out.println("Mary发送消息："+message);
    }
}
