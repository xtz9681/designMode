package iterator;

/**
 * desc
 *迭代器模式
 * 迭代抽象类
 * @author xutianzhe
 * @Date 2018/10/9
 **/
public interface Iterator {
    Object first();//得到开始对象
    Object next();//得到下一个对象
    Boolean isEnd();//判断是否到结尾
    Object currentItem();//得到当前对象
}
