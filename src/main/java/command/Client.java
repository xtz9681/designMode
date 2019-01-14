package command;

/**
 * desc
 *命令模式
 * 客户端
 * @author xutianzhe
 * @Date 2019/1/11
 **/
public class Client {
    /**
     *将一个请求（烤肉或者烤翅）封装为一个对象，从而是你可以用不同的请求对客户进行参数化；
     * 对请求排队或者记录请求你日志，以及支持可撤销的操作。
     *
     * 在需要撤销，恢复功能的时候可以考虑使用命令模式
     * @param args
     */
    public static void main(String[] args){
        /**
         * 1.较容易地设计一个名令队列
         * 2.在需要的情况下，可以较容易地将命令记录日志
         * 3.允许接收请求的一方决定是否要否决请求
         * 4.容易的实现对请求的撤销和重做
         * 5.增加新的具体命令类很容易
         * 6.把请求一个操作的对象与指导怎么执行一个操作的对象执行
         */
        //有一个烧烤小哥
        Barbecuer bbqBoy = new Barbecuer();

        //烧烤小哥该去做的事
        Command bakeMuttonCommand = new BakeMuttonCommand(bbqBoy);
        Command bakeChickenWingCommand = new BakeChickenWingCommand(bbqBoy);

        //有一个服务员小妹
        Waiter girl = new Waiter();

        //找服务员小妹点单
        girl.setOrder(bakeMuttonCommand);
        girl.setOrder(bakeChickenWingCommand);
        girl.setOrder(bakeMuttonCommand);

        //忽然不想要鸡翅了
        girl.cancelOrder(bakeChickenWingCommand);

        //服务员小妹叫烧烤小哥去做烧烤
        girl.inform();
    }
}
