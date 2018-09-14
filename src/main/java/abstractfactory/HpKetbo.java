package abstractfactory;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2018/9/12
 **/
public class HpKetbo implements IKeybo{
    public void createKeybo() {
        System.out.println("生产惠普键盘");
    }

    public void destroyKeybo() {
        System.out.println("销毁惠普键盘");
    }
}
