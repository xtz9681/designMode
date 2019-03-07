package visitor;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2019/2/27
 **/
public interface AccountBookViewer {

    void view(ConsumeBill consumeBill);
    void view(IncomeBill incomeBill);
}
