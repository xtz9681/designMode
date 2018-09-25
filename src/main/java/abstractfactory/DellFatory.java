package abstractfactory;

/**
 * desc
 *抽象工厂模式
 * 戴尔工厂类
 * @author xutianzhe
 * @Date 2018/9/25
 **/
public class DellFatory extends AbstractFactory {
    public IMouse createMouse() {
        return new DellMouse();
    }

    public IKeybo createKeybo() {
        return new DellKeybo();
    }
}
