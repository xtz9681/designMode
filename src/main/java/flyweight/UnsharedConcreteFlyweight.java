package flyweight;

/**
 * desc
 *享元模式
 * 非共享的享元类
 * @author xutianzhe
 * @Date 2019/2/26
 **/
public class UnsharedConcreteFlyweight extends Flyweight {

    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight:" + extrinsic);
    }
}
