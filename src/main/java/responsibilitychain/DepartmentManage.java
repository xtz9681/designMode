package responsibilitychain;

/**
 * desc
 *职责链模式
 * 具体处理类（经理类）
 * @author xutianzhe
 * @Date 2019/1/30
 **/
public class DepartmentManage extends Manager {
    public DepartmentManage(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        //请假天数大于3天的花需要经理和老板都同意
        if ("请假".equals(request.getRequestType()) && request.getRequestLevel() > 3){
            System.out.println(name+": "+request.getRequestContent()+" 级别 "+request.getRequestLevel()+" 被批准");
            if (superior != null){
                superior.requestApplications(request);
            }
        }else {
            if (superior != null){
                superior.requestApplications(request);
            }
        }
    }
}
