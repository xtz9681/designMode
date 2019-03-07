package visitor;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2019/3/7
 **/
public class Boss implements AccountBookViewer {

    private Double totalConsume = 0.0;
    private Double totalIncome = 0.0;


    public void view(ConsumeBill consumeBill) {
        totalConsume += consumeBill.getAmount();
    }

    public void view(IncomeBill incomeBill) {
        totalIncome += incomeBill.getAmount();
    }

    public Double getTotalConsume() {
        System.out.println("老板查看总花费"+totalConsume);
        return totalConsume;
    }

    public Double getTotalIncome() {
        System.out.println("老板查看总收入"+totalIncome);
        return totalIncome;
    }
}
