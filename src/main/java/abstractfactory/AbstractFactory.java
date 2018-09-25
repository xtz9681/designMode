package abstractfactory;

/**
 * desc
 *抽象工厂模式
 * 抽象工厂类
 * @author xutianzhe
 * @Date 2018/9/25
 **/
public abstract class AbstractFactory {
    public abstract IMouse createMouse();
    public abstract IKeybo createKeybo();
}
