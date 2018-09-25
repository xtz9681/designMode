package abstractfactory;

/**
 * desc
 *抽象工厂模式
 * 客户端
 * @author xutianzhe
 * @Date 2018/9/25
 **/
public class TestMain {
    public static void main(String[] args){
        /**
         * 优点，一个应用只需要初始化的时候出现一次。
         * 缺点，修改或增加一个产品，要修改或增加很多类。
         */
        AbstractFactory dellFactory = new DellFatory();
        IKeybo dellKeybo = dellFactory.createKeybo();
        IMouse dellMouse = dellFactory.createMouse();
        dellMouse.createMouse();
        dellKeybo.createKeybo();

        AbstractFactory hpFactory = new HpFatory();
        IMouse hpMouse = hpFactory.createMouse();
        IKeybo hpKeybo = hpFactory.createKeybo();
        hpMouse.createMouse();
        hpKeybo.createKeybo();
    }
}
