package simplefactory;

/**
 * desc
 *简单工厂模式
 * 父类
 * @author xutianzhe
 * @Date 2018/8/28
 **/
public class Operation {
    private Double numberA;
    private Double numberB;

    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }

    public Double getResult(){
        Double result = 0.0;
        return result;
    }
}
