package strategy;

/**
 * desc
 *策略模式
 * 正常收费策略
 * @author xutianzhe
 * @Date 2018/8/28
 **/
public class NormalCash extends CashSuper {
    @Override
    public Double acceptCash(Double amount) {
        return amount;
    }
}
