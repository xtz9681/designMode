package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * desc
 *访问者模式
 * @author xutianzhe
 * @Date 2019/3/7
 **/
public class AccountBook {
    //单子列表
    private List<Bill> billList = new ArrayList<Bill>();
    //添加单子
    public void addBill(Bill bill){
        billList.add(bill);
    }
    //供账本的查看者查看账本
    public void show(AccountBookViewer viewer){
        for (Bill bill : billList) {
            bill.accept(viewer);
        }
    }
}
