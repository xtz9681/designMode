package intepreter;

/**
 * desc
 *解释器模式
 * 具体的终结表达式类
 * @author xutianzhe
 * @Date 2019/2/27
 **/
public class MulNode extends SymbolNode {
    public MulNode(Node left, Node right) {
        super(left, right);
    }

    public int interprete() {
        return left.interprete()*right.interprete();
    }
}
