package factorymethod;

/**
 * desc
 *工厂方法模式
 * 加法类工厂
 * @author xutianzhe
 * @Date 2018/9/3
 **/
public class AddFatory implements IFactory {
    public Operation createOperation() {
        return new AddOperation();
    }
}
