package abstractfactory;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2018/9/11
 **/
public class DellKeybo implements IMouse {
    public void createMouse() {
        System.out.println("生产戴尔键盘");
    }

    public void destroyMouse() {
        System.out.println("销毁戴尔键盘");
    }
}
