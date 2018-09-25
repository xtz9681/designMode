package abstractfactory;

/**
 * desc
 *抽象工厂模式
 * 戴尔键盘实现类
 * @author xutianzhe
 * @Date 2018/9/11
 **/
public class DellKeybo implements IKeybo {
    public void createKeybo() {
        System.out.println("生产戴尔键盘");
    }

    public void destroyKeybo() {
        System.out.println("销毁戴尔键盘");
    }
}
