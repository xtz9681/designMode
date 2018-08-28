package simplefactory;

/**
 * desc
 *简单工厂模式
 * 减法操作类
 * @author xutianzhe
 * @Date 2018/8/28
 **/
public class SubOperation extends Operation {
    @Override
    public Double getResult(){
        Double result;
        result = getNumberA() - getNumberB();
        return result;
    }
}
