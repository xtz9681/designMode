package abstractfactory;

/**
 * desc
 *抽象工厂模式
 * 戴尔鼠标实现类
 * @author xutianzhe
 * @Date 2018/9/11
 **/
public class DellMouse implements IMouse {
    public void createMouse() {
        System.out.println("生产戴尔鼠标");
    }

    public void destroyMouse() {
        System.out.println("销毁戴尔鼠标");
    }
}
