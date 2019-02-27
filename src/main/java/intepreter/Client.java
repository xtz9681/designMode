package intepreter;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2019/2/27
 **/
public class Client{
    /**
     * 我没看懂有什么意义，就不写了，搞得不懂装懂-。-
     * @param args
     */
    public static void main(String args[]){
        String statement = "3 * 2 * 4 / 6 % 5";

        Calculator calculator = new Calculator();

        calculator.build(statement);

        int result = calculator.compute();

        System.out.println(statement + " = " + result);
    }
}
