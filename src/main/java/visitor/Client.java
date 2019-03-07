package visitor;

/**
 * desc
 *访问者模式
 * 客户端
 * @author xutianzhe
 * @Date 2019/3/7
 **/
public class Client {
    public static void main(String[] args) {
        /**
         * 同一种类型的对象结构在不同的对象用于不同地操作
         */
        AccountBook accountBook = new AccountBook();
        //添加两条收入
        accountBook.addBill(new IncomeBill(10000.0, "卖商品"));
        accountBook.addBill(new IncomeBill(12000.0, "卖广告位"));
        //添加两条支出
        accountBook.addBill(new ConsumeBill(1000.0, "工资"));
        accountBook.addBill(new ConsumeBill(2000.0, "材料费"));

        Boss boss = new Boss();
        AccountBookViewer cpa = new CPA();

        //两个访问者分别访问账本
        accountBook.show(cpa);
        accountBook.show(boss);

        boss.getTotalConsume();
        boss.getTotalIncome();
    }
}
