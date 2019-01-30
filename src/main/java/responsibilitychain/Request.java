package responsibilitychain;

/**
 * desc
 *职责链模式
 * 请求类
 * @author xutianzhe
 * @Date 2019/1/30
 **/
public class Request {
    /**
     * 申请类别
     */
    private String requestType;

    /**
     * 申请内容
     */
    private String requestContent;

    /**
     * 申请级别
     */
    private Integer requestLevel;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public Integer getRequestLevel() {
        return requestLevel;
    }

    public void setRequestLevel(Integer requestLevel) {
        this.requestLevel = requestLevel;
    }
}
