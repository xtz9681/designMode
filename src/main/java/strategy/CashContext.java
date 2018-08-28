package strategy;

/**
 * desc
 *策略模式
 * 上下文配置类
 * @author xutianzhe
 * @Date 2018/8/28
 **/
public class CashContext {
    private CashSuper cs;

    public CashContext(CashSuper cs) {
        this.cs = cs;
    }

    public Double getResult(Double amount){
        return cs.acceptCash(amount);
    }
}
