package state;

/**
 * desc
 *状态模式
 * 客户端
 * @author xutianzhe
 * @Date 2018/9/26
 **/
public class Test {
    /**
     * 目的就是为了消除庞大的条件分支,
     * 通过把各种状态逻辑转移到子类上，来减少相互依赖，还便于修改
     * 当一个对象的行为取决于它的状态，并且它必须在运行时刻根据状态改变它的行为时，
     * 就可以考虑用状态模式
     * @param args
     */
    public static void main(String[] args){
        /**
         * 将特定的状态相关的行为都放入一个状态中
         * 由于所有与转台相关的代码都存在于某个StateX中，
         * 所以通过定义新的子类可以很容易的增加新的状态和转换
         */
        //先给了一个初始状态
        Context context = new Context(new StateA());
        context.handle();
        if (true){
            context.setState(new StateB());
        }
        context.handle();

    }
}
