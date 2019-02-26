package flyweight;

/**
 * desc
 *享元模式
 * 客户端
 * @author xutianzhe
 * @Date 2019/2/26
 **/
public class Client {
    /**
     * String常量池、数据库连接池、缓冲池等等都是享元模式的应用
     * 利用共享技术有效地支持大量细粒度的对象
     * 由于分配过多的对象会影响程序性能，有可能会导致内存溢出
     * @param args
     */

    public static void main(String[] args) {
        int extrinsic = 22;

        Flyweight flyweightX = FlyweightFactory.getFlyweight("X");
        flyweightX.setIntrinsic("内部状态X");
        flyweightX.operate(++ extrinsic);
        System.out.println(flyweightX.getIntrinsic());

        Flyweight flyweightY = FlyweightFactory.getFlyweight("Y");
        flyweightY.operate(++ extrinsic);

        System.out.println(flyweightX.equals(flyweightY));
        //X和Y不是同一实例，不共享内部状态
        System.out.println(flyweightY.getIntrinsic());

        Flyweight flyweightZ = FlyweightFactory.getFlyweight("Z");
        flyweightZ.operate(++ extrinsic);
        System.out.println(flyweightX.equals(flyweightZ));
        System.out.println(flyweightY.equals(flyweightZ));

        Flyweight flyweightReX = FlyweightFactory.getFlyweight("X");
        flyweightReX.operate(++ extrinsic);
        //true     flyweightX和flyweightReX是一个实例
        System.out.println(flyweightX.equals(flyweightReX));
        System.out.println(flyweightY.equals(flyweightReX));
        System.out.println(flyweightZ.equals(flyweightReX));
        //X和REX是同一实例，共享同一个外部状态
        System.out.println(flyweightReX.getIntrinsic());

        Flyweight unsharedFlyweight = new UnsharedConcreteFlyweight("X");
        unsharedFlyweight.operate(++ extrinsic);
        //false     flyweightX和unsharedFlyweight不是一个实例
        System.out.println(flyweightX.equals(unsharedFlyweight));
        System.out.println(flyweightY.equals(unsharedFlyweight));
        System.out.println(flyweightZ.equals(unsharedFlyweight));
        //false     flyweightReX和unsharedFlyweight不是一个实例
        System.out.println(flyweightReX.equals(unsharedFlyweight));
    }

}
