package factorymethod;

/**
 * desc
 *工厂方法模式
 * 客户端
 * @author xutianzhe
 * @Date 2018/9/3
 **/
public class OperationMain {
    /**
     * 工厂方法的特点在于客户端逻辑判断需要实现哪个方法，而简单工厂则是在工厂类判断的。
     *要加功能不必修改工厂类，这是最主要的原因。符合对扩展开放，对修改关闭的原则
     */
    public static void main(String[] args){
        String operation = "+";
        Operation oper = null;
        if ("+".equals(operation)){
            oper = new AddOperation();
        }else if ("-".equals(operation)){
            oper = new SubOperation();
        }
        oper.setNumberA(5.2);
        oper.setNumberB(5.3);
        System.out.print(oper.getResult());
    }
}
