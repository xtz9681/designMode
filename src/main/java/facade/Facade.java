package facade;

/**
 * desc
 *外观模式
 * 外观类
 * @author xutianzhe
 * @Date 2018/9/5
 **/
public class Facade {
    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
    }

    public void methodA(){
        System.out.println("外观类方法A");
        one.methodOne();
        two.methodTwo();
    }

    public void methodB(){
        System.out.println("外观类方法B");
        three.method3();
        one.methodOne();
    }
}
