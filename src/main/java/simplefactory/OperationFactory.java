package simplefactory;

/**
 * desc
 *简单工厂模式
 * 工厂类
 * @author xutianzhe
 * @Date 2018/8/28
 **/
public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation oper = null;
        if ("+".equals(operate)){
            oper = new AddOperation();
        }else if ("-".equals(operate)){
            oper = new SubOperation();
        }else {
            System.out.print("请输入正确的运算符");
        }
        return oper;
    }
}
