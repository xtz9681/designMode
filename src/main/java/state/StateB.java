package state;

/**
 * desc
 *状态模式
 * 状态B类
 * @author xutianzhe
 * @Date 2018/9/26
 **/
public class StateB implements State {

    public void handle(Context context) {
        System.out.println("当前状态为B");
        //该状态完成之后，到了状态A
        //context.setState(new StateA());
    }
}
