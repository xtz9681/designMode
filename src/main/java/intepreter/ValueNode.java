package intepreter;

/**
 * desc
 *解释器模式
 * 非终结表达式
 * 用于解释该表达式的值
 * @author xutianzhe
 * @Date 2019/2/27
 **/
public class ValueNode implements Node {
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    public int interprete() {
        return this.value;
    }
}
