package templatemethod;

/**
 * desc
 *模板方法模式
 * 模板类
 * @author xutianzhe
 * @Date 2018/9/4
 **/
public abstract class TemplateClass {
    public abstract void method1();
    public abstract void method2();
    protected void method3(){
        System.out.println("不变的方法3");
    }
    protected void method4(){
        System.out.println("不变的方法4");
    }

    public void realizeMethods(){
        method1();
        method2();
        method3();
        method4();
    }
}
