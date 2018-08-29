package strategy;

/**
 * desc
 *策略模式
 * 结合简单工厂模式的策略模式
 * 上下文配置类
 * @author xutianzhe
 * @Date 2018/8/28
 **/
public class NewCashContext {
    private static String normal = "正常收费";
    private static String rebate = "打8折";
    private static String retrurn = "满300减50";
    CashSuper cs = null;

    public NewCashContext(String type) {
        if (normal.equals(type)){
            NormalCash nc = new NormalCash();
            cs = nc;
        }else if (rebate.equals(type)){
            RebateCash rebateCash = new RebateCash(0.8);
            cs = rebateCash;
        }else if (retrurn.equals(type)){
            ReturnCash rc = new ReturnCash(300,50);
            cs = rc;
        }
    }

    public Double getResult(Double amount){
        return cs.acceptCash(amount);
    }
}
