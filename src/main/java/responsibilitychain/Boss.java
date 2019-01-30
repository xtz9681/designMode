package responsibilitychain;

/**
 * desc
 *职责链模式
 * 具体处理类（老板类）
 * @author xutianzhe
 * @Date 2019/1/30
 **/
public class Boss extends Manager {
    public Boss(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假")){
            System.out.println(name+": "+request.getRequestContent()+" 级别 "+request.getRequestLevel()+" 被批准");
        }else if (request.getRequestType().equals("加薪") && request.getRequestLevel() < 3){
            System.out.println(name+": "+request.getRequestContent()+" 级别 "+request.getRequestLevel()+" 被批准");
        }else if (request.getRequestType().equals("加薪") && request.getRequestLevel() >= 3){
            System.out.println(name+": "+request.getRequestContent()+" 级别 "+request.getRequestLevel()+" 需要考虑");
        }
    }
}
