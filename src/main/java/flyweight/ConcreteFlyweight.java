package flyweight;

/**
 * desc
 *享元模式
 * 具体享元类
 * @author xutianzhe
 * @Date 2019/2/26
 **/
public class ConcreteFlyweight extends Flyweight {

    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("具体Flyweight:" + extrinsic);
    }
}
