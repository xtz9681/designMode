package composite;

/**
 * desc
 *组合模式
 * 叶节点
 * @author xutianzhe
 * @Date 2018/10/9
 **/
public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        String str = "-";
        for (int i=0;i<depth;i++){
            str+="-" ;
        }
        System.out.println(str + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+"员工招聘培训管理");
    }
}
