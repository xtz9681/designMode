package factorymethod;

/**
 * desc
 *工厂方法模式
 * 加法操作类
 * @author xutianzhe
 * @Date 2018/9/3
 **/
public class AddOperation extends Operation {
    @Override
    public Double getResult(){
        Double result;
        result = getNumberA() + getNumberB();
        return result;
    }
}
