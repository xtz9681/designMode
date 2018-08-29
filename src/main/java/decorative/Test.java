package decorative;

/**
 * desc
 *装饰模式
 * @author xutianzhe
 * @Date 2018/8/29
 **/
public class Test {
    public static void main(String[] args){
        /**
         * 在不改变原类文件和使用继承的情况下，动态地给这个类继续增加职责（动作）
         * 像Human类有一个show()方法，在不改变show()方法的情况下，往里增加了各种职责，
         * 而且是动态地，可自定义顺序的增加
         */
        Human human = new Human("Trent");

        Underpants underpants = new Underpants();
        Bottoms bottoms = new Bottoms();
        Shoe shoe = new Shoe();
        Jacket jacket = new Jacket();

        System.out.println("第一种,先穿衣服再穿鞋");
        underpants.setDecorator(human);
        bottoms.setDecorator(underpants);
        jacket.setDecorator(bottoms);
        shoe.setDecorator(jacket);
        shoe.show();

        System.out.println();
        System.out.println("第二种,先穿鞋再穿衣服");
        underpants.setDecorator(human);
        bottoms.setDecorator(underpants);
        shoe.setDecorator(bottoms);
        jacket.setDecorator(shoe);
        jacket.show();
    }
}
