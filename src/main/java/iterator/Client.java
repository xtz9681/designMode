package iterator;

/**
 * desc
 *迭代器模式
 * 客户端
 * @author xutianzhe
 * @Date 2018/10/9
 **/
public class Client {
    /**
     * 提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示
     * 现在一般不再用这个模式了，因为很多语言本身已经把这个模式坐在语言中了
     * 例如java的 foreach in
     * 当需要对聚集又多种方式遍历时，可以考虑用迭代器模式
     * @param args
     */
    public static void main(String[] args){
        /**
         * 分离了及核对下的遍历行为，抽象出了一个迭代器类来负责，这样既可以做到
         * 不暴露集合的内部结构，又可以让外部代码透明地访问集合内部的数据
         */
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.setItem(0,"张三");
        aggregate.setItem(1,"李四");
        aggregate.setItem(2,"王五");
        aggregate.setItem(3,"习大大");
        aggregate.setItem(4,"Trent");
        aggregate.setItem(5,"月球人");
        aggregate.setItem(6,"特朗普");

        Iterator iterator = new ConcreteIterator(aggregate);
        Object item = iterator.first();

        while (!iterator.isEnd()){
            System.out.println(iterator.currentItem()+",不管你是谁，请买车票");
            iterator.next();
        }
    }
}
