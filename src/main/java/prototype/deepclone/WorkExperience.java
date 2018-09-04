package prototype.deepclone;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2018/9/4
 **/
public class WorkExperience implements Cloneable {
    private String time;
    private String companyName;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public WorkExperience clone(){
        try {
            return (WorkExperience)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
