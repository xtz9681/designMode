package facade;

/**
 * desc
 *外观模式
 * 客户端类
 * @author xutianzhe
 * @Date 2018/9/7
 **/
public class Test {
    public static void main(String[] args){
        /**
         *他隐藏了系统的复杂性，并向客户端提供了一个可以访问系统的接口
         * 松耦合，使系统内部模块更容易扩展和维护
         * 客户端根本不需要知道子系统内部的实现，只需要知道外观类就好了
         */
        Facade facade = new Facade();
        facade.methodA();
        System.out.println("-------------------------");
        facade.methodB();
    }
}
