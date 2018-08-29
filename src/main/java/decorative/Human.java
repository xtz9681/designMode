package decorative;

/**
 * desc
 *装饰者模式
 * 定义了一个具体对象继承抽象父类
 * @author xutianzhe
 * @Date 2018/8/28
 **/
public class Human extends Person{

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public Human() {
    }

    @Override
    public void show() {
        System.out.print("装饰的"+name);
    }
}
