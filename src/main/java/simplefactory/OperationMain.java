package simplefactory;

/**
 * desc
 *简单工厂
 * @author xutianzhe
 * @Date 2018/8/28
 **/
public class OperationMain {
    public static void main(String[] args){
        Operation oper;
        oper = OperationFactory.createOperate("+");
        oper.setNumberA(2.8);
        oper.setNumberB(2.8);
        System.out.print(oper.getResult());
    }
}
