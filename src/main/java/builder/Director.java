package builder;

/**
 * desc
 *建造者模式
 * 指挥者类
 * @author xutianzhe
 * @Date 2018/9/10
 **/
public class Director {
    public void construct(Builder builder){
        builder.buildCPU();
        builder.buildHD();
        builder.buildMainBoard();
    }
}
