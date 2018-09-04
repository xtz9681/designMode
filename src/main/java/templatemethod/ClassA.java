package templatemethod;

/**
 * desc
 *模板方法模式
 * 具体类A
 * @author xutianzhe
 * @Date 2018/9/4
 **/
public class ClassA extends TemplateClass {
    @Override
    public void method1() {
        System.out.println("具体类A实现方法1");
    }

    @Override
    public void method2() {
        System.out.println("具体类A实现方法2");
    }
}
