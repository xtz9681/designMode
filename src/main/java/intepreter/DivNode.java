package intepreter;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2019/2/27
 **/
public class DivNode extends SymbolNode{
    public DivNode(Node left, Node right) {
        super(left, right);
    }


    public int interprete() {
        return left.interprete()/right.interprete();
    }
}
