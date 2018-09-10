package builder;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2018/9/10
 **/
public class ConcreteBuilder1 implements Builder{

    public void buildCPU() {
        System.out.println("CPU一");
    }

    public void buildMainBoard() {
        System.out.println("主板A");
    }

    public void buildHD() {
        System.out.println("硬盘A");
    }
}
