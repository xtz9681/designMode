package abstractfactory;

/**
 * desc
 *抽象工厂模式
 * 惠普工厂类
 * @author xutianzhe
 * @Date 2018/9/25
 **/
public class HpFatory extends AbstractFactory{
    public IMouse createMouse() {
        return new HpMouse();
    }

    public IKeybo createKeybo() {
        return new HpKeybo();
    }
}
