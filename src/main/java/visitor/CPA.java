package visitor;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2019/3/7
 **/
public class CPA implements AccountBookViewer {
    public void view(ConsumeBill consumeBill) {
        if (consumeBill.getItem().equals("工资")) {
            System.out.println("注会查看工资是否交个人所得税。");
        }
    }

    public void view(IncomeBill incomeBill) {
        System.out.println("注会查看收入交税了没。");
    }
}
