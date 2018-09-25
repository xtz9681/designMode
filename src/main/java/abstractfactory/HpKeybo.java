package abstractfactory;

/**
 * desc
 *抽象工厂模式
 * 惠普键盘实现类
 * @author xutianzhe
 * @Date 2018/9/12
 **/
public class HpKeybo implements IKeybo{
    public void createKeybo() {
        System.out.println("生产惠普键盘");
    }

    public void destroyKeybo() {
        System.out.println("销毁惠普键盘");
    }
}
