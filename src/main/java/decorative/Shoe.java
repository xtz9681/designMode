package decorative;

/**
 * desc
 *装饰模式
 * 鞋子类
 * @author xutianzhe
 * @Date 2018/8/29
 **/
public class Shoe extends Decorator {


    @Override
    public void show(){
        System.out.print("鞋子 ");
        super.show();
    }
}
