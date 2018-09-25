package abstractfactory;

/**
 * desc
 *抽象工厂模式
 * 惠普鼠标实现类
 * @author xutianzhe
 * @Date 2018/9/11
 **/
public class HpMouse implements IMouse {
    public void createMouse() {
        System.out.println("生产惠普鼠标");
    }

    public void destroyMouse() {
        System.out.println("销毁惠普鼠标");
    }
}
