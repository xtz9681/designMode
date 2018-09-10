package builder;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2018/9/10
 **/
public class ConcreteBuilder2 implements Builder{

    public void buildCPU() {
        System.out.println("CPU二");
    }

    public void buildMainBoard() {
        System.out.println("主板B");
    }

    public void buildHD() {
        System.out.println("硬盘B");
    }
}
