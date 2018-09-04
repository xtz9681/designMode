package prototype.shallowclone;

/**
 * desc
 *原型模式
 * 简历类
 * @author xutianzhe
 * @Date 2018/9/3
 **/
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private Integer age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }


    /**
     * 编写个人信息
     * @param sex
     * @param age
     */
    public void setPersonableInfo(String sex,Integer age){
        this.sex = sex;
        this.age = age;
    }

    /**
     * 编写工作经历
     * @param time
     * @param companyName
     */
    public void setWorkExperience(String time,String companyName){
        work.setTime(time);
        work.setCompanyName(companyName);
    }

    @Override
    public Resume clone(){
        try {
            return (Resume)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void dispaly(){
        System.out.println(name+" "+sex+" "+age);
        System.out.println("工作经历："+work.getTime()+" "+work.getCompanyName());
        System.out.println();
    }
}
