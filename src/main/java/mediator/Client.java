package mediator;

/**
 * desc
 *中介者类
 * 客户端
 * @author xutianzhe
 * @Date 2019/2/14
 **/
public class Client {
    /**
     * 用一个中介对象类封装一系列的对象交互。
     * 中介者使各对象不需要显示的相互引用，从而使其耦合松散，而且可以独立地改变他们之间的交互。
     * @param args
     */
    public static void main(String[] args){
        /**
         * 中介者类的出现减少了各个同事类之间的耦合，可以独立地改变和复用各个同事类和中介者类
         * 由于具体中介者类一般会很复杂，所以使用该模式时需要谨慎考虑
         */
        ChatTr2Ma chatTr2Ma = new ChatTr2Ma();

        UserTrent trent = new UserTrent(chatTr2Ma);
        UserMary mary = new UserMary(chatTr2Ma);

        chatTr2Ma.setTrent(trent);
        chatTr2Ma.setMary(mary);

        System.out.println("Trent和Mary的聊天室聊天记录");
        trent.sendMessage("初次见面，我的名字叫Trend");
        mary.sendMessage("你好，我叫Mary");
    }
}
