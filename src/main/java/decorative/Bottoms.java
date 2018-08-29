package decorative;

/**
 * desc
 *装饰类
 * 下装类
 * @author xutianzhe
 * @Date 2018/8/29
 **/
public class Bottoms extends Decorator{


    @Override
    public void show(){
        System.out.print("裤子 ");
        super.show();
    }
}
