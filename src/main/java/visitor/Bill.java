package visitor;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2019/2/27
 **/
public interface Bill {
    void accept(AccountBookViewer viewer);
}
