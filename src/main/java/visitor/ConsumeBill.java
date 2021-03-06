package visitor;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2019/2/27
 **/
public class ConsumeBill implements Bill {
    private Double amount;
    private String item;

    public ConsumeBill(Double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    public void accept(AccountBookViewer viewer) {
        viewer.view(this);
    }

    public Double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
