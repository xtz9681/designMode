package responsibilitychain;

/**
 * desc
 *职责链模式
 * 客户端
 * @author xutianzhe
 * @Date 2019/1/30
 **/
public class Client {
    /**
     * 使多个对象都有机会处理请求，从而避免请求发送者和接收者之间的耦合关系
     * 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止
     * @param args
     */
    public static void main(String[] args){
        /**
         * 例子使用了审批流程的方式说明了职责链模式的原理
         * 设置各个职责人，将他们传承了一个链，链式地去处理一个请求
         */
        Charger zhuguan = new Charger("主管A");
        DepartmentManage jingli = new DepartmentManage("经理A");
        Boss laoban = new Boss("老板");

        zhuguan.setSuperior(jingli);
        jingli.setSuperior(laoban);

        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContent("Trent想请假2天");
        request1.setRequestLevel(2);
        zhuguan.requestApplications(request1);
        System.out.println();

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("Trent想请假5天");
        request2.setRequestLevel(4);
        zhuguan.requestApplications(request2);
        System.out.println();

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("Trent想加薪1000块");
        request3.setRequestLevel(2);
        zhuguan.requestApplications(request3);
        System.out.println();

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("Trent想加薪10000块");
        request4.setRequestLevel(5);
        zhuguan.requestApplications(request4);
    }
}
