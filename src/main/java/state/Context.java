package state;

/**
 * desc
 *状态模式
 * 上下文类
 * @author xutianzhe
 * @Date 2018/9/26
 **/
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle(){
        this.state.handle(this);
    }
}
