package bridge;

/**
 * desc
 *桥接模式
 * 客户端
 * @author xutianzhe
 * @Date 2019/1/7
 **/
public class Client {
    /**
     * 实现系统可能有多角度分类，每一种分类都有可能有变化，
     * （比如手机有不同的牌子，相同牌子的手机有不同的软件，相同的软件有不同适配手机的版本。）
     * 那么就把这种多角度分离出来让他们独立变化，减少耦合。
     * @param args
     */
    public static void main(String[] args){
        /**
         * 将抽象部分与它的实现分离，是他们都可以独立地变化。
         */
        PhoneAbstract nokia = new NokiaPhone();
        nokia.setPhoneSoft(new PhoneGameSoft());
        nokia.run();
        nokia.setPhoneSoft(new PhoneAddressSoft());
        nokia.run();
        PhoneAbstract moto = new MotorolaPhone();
        moto.setPhoneSoft(new PhoneGameSoft());
        moto.run();
        moto.setPhoneSoft(new PhoneAddressSoft());
        moto.run();
    }
}
