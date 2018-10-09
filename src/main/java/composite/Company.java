package composite;

/**
 * desc
 *组合模式
 * 组合对象接口类（抽象类）
 * @author xutianzhe
 * @Date 2018/10/9
 **/
public abstract class Company {
    protected String name;

    public Company(String name){
        this.name = name;
    }

    public abstract void add(Company company);
    public abstract void remove(Company company);
    public abstract void display(int depth);//显示
    public abstract void lineOfDuty();//履行职责
}
