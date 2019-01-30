package responsibilitychain;

/**
 * desc
 *职责链模式
 * 处理请求抽象类(管理者类)
 * @author xutianzhe
 * @Date 2019/1/30
 **/
public abstract class Manager {
    /**
     * 管理者名称
     */
    protected String name;
    /**
     * 管理者的上级
     */
    protected Manager superior;

    public Manager(String name){
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    abstract public void requestApplications(Request request);
}
