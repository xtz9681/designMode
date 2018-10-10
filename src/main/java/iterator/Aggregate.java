package iterator;


/**
 * desc
 *迭代器模式
 * 聚集抽象类
 * @author xutianzhe
 * @Date 2018/10/9
 **/
public interface Aggregate {
    Iterator createIterator();//创建迭代器
}
