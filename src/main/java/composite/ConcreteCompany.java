package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * desc
 *组合模式
 * 具体枝节点
 * @author xutianzhe
 * @Date 2018/10/9
 **/
public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    public void add(Company company) {
        children.add(company);
    }

    public void remove(Company company) {
        children.remove(company);
    }

    public void display(int depth) {
        String str = "-";
        for (int i=0;i<depth;i++){
            str+="-" ;
        }
        System.out.println(str + name);
        for (Company component:children){
            component.display(depth+2);
        }
    }

    public void lineOfDuty() {
        for (Company component:children){
            component.lineOfDuty();
        }
    }
}
