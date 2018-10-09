package composite;

/**
 * desc
 *组合模式
 * 客户端
 * @author xutianzhe
 * @Date 2018/10/9
 **/
public class Client {
    /**
     * 将对象组合成树形结构以表示'部分--整体'的层次结构
     * 当需求中是体现部分与整体层次的结构时，希望用户可以忽略组合对象（枝节点）与单个对象（叶节点）的不同
     * ，统一地使用组合结构中的所有对象时，可以考虑使用组合结构
     * @param args
     */
    public static void main(String[] args){
        /**
         * 定义了包含人力资源部，财务部等的基本对象和分公司，办事处等的组合对象的类层次结构。
         * 基本对象又可以被组合成更复杂的组合对象.如：new HRDepartment().add()。
         * 组合对象又可以被组合，不断地被递归下去。
         * 用户不用关心到底是处理一个叶节点还是处理一个枝节点
         */
        ConcreteCompany root = new ConcreteCompany("比智科技杭州总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany cdCompany = new ConcreteCompany("成都分公司");
        cdCompany.add(new HRDepartment("成都分公司人力资源部"));
        cdCompany.add(new FinanceDepartment("成都分公司财务部"));
        root.add(cdCompany);

        ConcreteCompany hxComapny = new ConcreteCompany("火星办事处");
        hxComapny.add(new HRDepartment("火星办事处人力资源部"));
        hxComapny.add(new FinanceDepartment("火星办事处财务部"));
        cdCompany.add(hxComapny);

        root.display(1);
        root.lineOfDuty();
    }
}
