package flyweight;

/**
 * desc
 *享元模式
 * 抽象享元类
 * @author xutianzhe
 * @Date 2019/2/25
 **/
public abstract class Flyweight {
    /**
     * 内部状态
     **/
    public String intrinsic;

    /**
     * 外部状态
     */
    protected final String extrinsic;

    /**
     * 要求享元模式必须接受外部状态
     * @param extrinsic
     */
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate(int extrinsic);

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
