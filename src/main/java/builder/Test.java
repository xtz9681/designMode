package builder;

/**
 * desc
 *建造者模式
 * 客户端
 * @author xutianzhe
 * @Date 2018/9/10
 **/
public class Test {
    /**
     * 当需要生成的对象或产品的内部结构比较复杂时会用到建造者模式，将复杂的产品一步步分解成一个个方法
     * 易于精确控制内部对象的创建。
     * 这些对象或产品需要有一些共性（因为需要继承一个接口）。
     * 易扩展，增加新的具体建造者不需要修改类库
     * @param args
     */
    public static void main(String[] args){
        /**
         * 下列例子是通过建造者模式组装电脑
         * 在对象或产品中内部的方法相互没依赖，但都必不可少，可先抽象出各个方法
         */
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();
        Director director = new Director();
        System.out.println("指挥者构建具体建造者1");
        director.construct(builder1);
        System.out.println("组装完毕！");
        System.out.println("----------------------------------");
        System.out.println("指挥者构建具体建造者2");
        director.construct(builder2);
        System.out.println("组装完毕！");

    }
}
