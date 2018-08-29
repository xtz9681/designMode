package decorative;

/**
 * desc
 * 装饰模式
 * 服饰类
 * 类似io中的FilterInputStream，继承InputStream，内部又维护了一个InputStream
 * 调用了它的所有方法。FilterInputStream其实什么也没做，只是把调用委托给了InputStream
 * @author xutianzhe
 * @Date 2018/8/29
 **/
public class Decorator extends Person{

    public Decorator() {
    }

    protected Person person;

    public void setDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (null != person) {
            person.show();
        }
    }
}
