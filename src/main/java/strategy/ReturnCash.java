package strategy;

/**
 * desc
 *策略模式
 * 满减策略
 * @author xutianzhe
 * @Date 2018/8/28
 **/
public class ReturnCash extends CashSuper{

    /**
     * 满额标准
     */
    private Integer standard;

    /**
     *减额
     */
    private Integer subAmount;

    public ReturnCash(Integer standard, Integer subAmount) {
        this.standard = standard;
        this.subAmount = subAmount;
    }

    @Override
    public Double acceptCash(Double amount) {
        Double result = amount;
        if (amount>standard){
            result = amount - (int)(amount/standard)*subAmount;
        }
        return result;
    }
}
