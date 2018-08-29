package strategy;

/**
 * desc
 *策略模式
 * 结合简单工厂模式的策略模式
 * 客户端
 * @author xutianzhe
 * @Date 2018/8/28
 **/
public class NewStrategyMain {

    /**
     * 从结合了简单工厂模式的策略模式中可以看出，它的耦合度更低，客户端只需要知道
     * NewCashContext这个类就好了。
     * 而纯策略模式中的客户端需要知道
     * CashContext和CashSuper类。
     * @param args
     */
    public static void main(String[] args){
        NewCashContext cc = new NewCashContext("正常收费");
        System.out.println(cc.getResult(842.54));
        NewCashContext cc1 = new NewCashContext("打8折");
        System.out.println(cc1.getResult(842.54));
        NewCashContext cc2 = new NewCashContext("满300减50");
        System.out.println(cc2.getResult(842.54));
    }
}
