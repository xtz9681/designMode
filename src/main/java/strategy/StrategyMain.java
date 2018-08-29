package strategy;

/**
 * desc
 *策略模式
 * 客户端类
 * @author xutianzhe
 * @Date 2018/8/28
 **/
public class StrategyMain {
    private static String normal = "正常收费";
    private static String rebate = "打8折";
    private static String retrurn = "满300减50";
    public static Double getResult(String type,Double amount){
        CashContext cc = null;
        if (normal.equals(type)){
            cc = new CashContext(new NormalCash());
        }else if (rebate.equals(type)){
            cc = new CashContext(new RebateCash(0.8));
        }else if (retrurn.equals(type)){
            cc = new CashContext(new ReturnCash(300,50));
        }
        return cc.getResult(amount);
    }

    /**
     * 策略模式的一种定义了一系列算法的方法，这些算法做的都是相同的事，但实现的过程与结果不同，减少了
     * 各算法类的耦合
     * @param args
     */
    public static void main(String[] args){
        System.out.println(getResult("正常收费",865.87));
        System.out.println(getResult("打8折",865.87));
        System.out.println(getResult("满300减50",865.87));
    }
}
