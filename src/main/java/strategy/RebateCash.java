package strategy;

/**
 * desc
 *策略模式
 * 折扣策略
 * @author xutianzhe
 * @Date 2018/8/28
 **/
public class RebateCash extends CashSuper{
    /**
     * 折扣率
     */
    private Double rebate;

    public RebateCash(Double rebate) {
        this.rebate = rebate;
    }

    @Override
    public Double acceptCash(Double amount) {
        return amount * rebate;
    }
}
