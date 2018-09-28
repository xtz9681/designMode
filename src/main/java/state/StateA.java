package state;

/**
 * desc
 *状态模式
 * 状态A类
 * @author xutianzhe
 * @Date 2018/9/26
 **/
public class StateA implements State {
    public void handle(Context context) {
        System.out.println("当前状态为A");
        //该状态完成之后，到了状态B
        //context.setState(new StateB());
    }
}
