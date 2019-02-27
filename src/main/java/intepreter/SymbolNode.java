package intepreter;

/**
 * desc
 *解释器模式
 * 抽象终结表达式
 * @author xutianzhe
 * @Date 2019/2/27
 **/
public abstract class SymbolNode implements Node{
    protected Node left;
    protected Node right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}
