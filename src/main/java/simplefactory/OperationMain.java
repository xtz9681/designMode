package simplefactory;

/**
 * desc
 *简单工厂
 * 客户端类
 * @author xutianzhe
 * @Date 2018/8/28
 **/
public class OperationMain {
    /**
     * 简单工厂模式其实就是简单的将一些方法进行封装，降低耦合度
     * 但不利于扩展，因为增加了一种方法，需要修改工厂类的代码，违背了对扩展开放，对修改关闭的原则
     */
    public static void main(String[] args){
        Operation oper;
        oper = OperationFactory.createOperate("+");
        oper.setNumberA(2.8);
        oper.setNumberB(2.8);
        System.out.print(oper.getResult());
    }
}
