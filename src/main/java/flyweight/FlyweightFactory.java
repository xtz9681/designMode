package flyweight;

import java.util.HashMap;

/**
 * desc
 *享元模式
 * 享元工厂
 * @author xutianzhe
 * @Date 2019/2/26
 **/
public class FlyweightFactory {
    /**
     * 定义一个池容器
     */
    private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

    public static Flyweight getFlyweight(String extrinsic){
        Flyweight flyweight = null;


        if (pool.containsKey(extrinsic)) {
            //池中有该对象
            flyweight = pool.get(extrinsic);
            System.out.print("已有 " + extrinsic + " 直接从池中取---->");
        }else {
            //根据外部状态创建享元对象
            flyweight = new ConcreteFlyweight(extrinsic);

            //放入池中
            pool.put(extrinsic,flyweight);
            System.out.print("创建 " + extrinsic + " 并从池中取---->");
        }
        return flyweight;
    }
}
