package decorative;


/**
 * desc
 *装饰模式
 * 裤衩类
 * @author xutianzhe
 * @Date 2018/8/29
 **/
public class Underpants extends Decorator{



    @Override
    public void show(){
        System.out.print("裤衩 ");
        super.show();
    }
}
