package templatemethod;

/**
 * desc
 *模板方法模式
 * @author xutianzhe
 * @Date 2018/9/4
 **/
public class Test {
    public static void main(String[] args){
        /**
         * 模板方法模式就是将不变的代码与可变的部分抽离开来，将不变的代码上升到一个超类
         * 可变的代码用继承的方式重写。避免重复的代码，增加可维护性
         */
        TemplateClass classA = new ClassA();
        classA.realizeMethods();
        System.out.println("--------------------");
        TemplateClass classB = new ClassB();
        classB.realizeMethods();
    }
}
