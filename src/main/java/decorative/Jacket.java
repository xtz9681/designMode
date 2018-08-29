package decorative;

/**
 * desc
 *装饰模式
 * 上衣类
 * @author xutianzhe
 * @Date 2018/8/29
 **/
public class Jacket extends Decorator{

    @Override
    public void show(){
        System.out.print("上衣 ");
        super.show();
    }
}
