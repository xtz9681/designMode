package facade;

/**
 * desc
 *外观模式
 * 子类二
 * @author xutianzhe
 * @Date 2018/9/5
 **/
public class SubSystemTwo {
    /**
     * 为了突出子类1和子类二有不同
     */
    private String str = "方法二";
    public void methodTwo(){
        System.out.println("子系统二"+str);
    }
}
