package iterator;

/**
 * desc
 *迭代器模式
 * 具体迭代器类
 * @author xutianzhe
 * @Date 2018/10/9
 **/
public class ConcreteIterator implements Iterator {
    //定义一个具体聚集对象
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Object first() {
        return aggregate.getItem(0);
    }

    public Object next() {
        Object ret = null;
        current++;
        if (current<aggregate.getCount()){
            ret = aggregate.getItem(current);
        }
        return ret;
    }

    public Boolean isEnd() {
        return current >=aggregate.getCount()?true:false;
    }

    public Object currentItem() {
        return aggregate.getItem(current);
    }
}
