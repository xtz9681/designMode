package bridge;

/**
 * desc
 *桥接模式
 * 手机品牌抽象类
 * @author xutianzhe
 * @Date 2019/1/7
 **/
public class PhoneAbstract {
    private PhoneSoft phoneSoft;

    public void setPhoneSoft(PhoneSoft phoneSoft){
        this.phoneSoft = phoneSoft;
    }

    public void run(){
        phoneSoft.run();
    }
}
