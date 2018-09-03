package factorymethod;

/**
 * desc
 * 工厂方法模式
 *减法类工厂
 * @author xutianzhe
 * @Date 2018/9/3
 **/
public class SubFatory implements IFactory {
    public Operation createOperation() {
        return new SubOperation();
    }
}
