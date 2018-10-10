package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * desc
 *迭代器模式
 * 具体聚集类
 * @author xutianzhe
 * @Date 2018/10/9
 **/
public class ConcreteAggregate implements Aggregate {
    private List<Object> items = new ArrayList<Object>();
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object getItem(int index) {
        return items.get(index);
    }

    public void setItem(int index,Object value) {
        items.add(index,value);
    }

    public Integer getCount() {
        return items.size();
    }

}
