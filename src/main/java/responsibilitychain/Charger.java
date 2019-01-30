package responsibilitychain;

/**
 * desc
 *职责链模式
 * 具体处理类（主管类）
 * @author xutianzhe
 * @Date 2019/1/30
 **/
public class Charger extends Manager{
    public Charger(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && request.getRequestLevel() <= 2){
            System.out.println(name+": "+request.getRequestContent()+" 级别 "+request.getRequestLevel()+" 被批准");
        }else {
            if (superior != null){
                superior.requestApplications(request);
            }
        }
    }


}
