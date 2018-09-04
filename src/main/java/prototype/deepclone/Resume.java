package prototype.deepclone;

/**
 * desc
 *
 * @author xutianzhe
 * @Date 2018/9/4
 **/
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private Integer age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    /**
     * 提供clone方法调用的私有的构造函数，以便深复制“工作经历”的数据
     * @param work
     */
    private Resume(WorkExperience work){
        this.work = work.clone();
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

    /**
     * 重写clone方法，调用私有的构造函数。完成深复制
     * @return
     */
    @Override
    public Resume clone(){
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }

    public void dispaly(){
        System.out.println(name+" "+sex+" "+age);
        System.out.println("工作经历："+work.getTime()+" "+work.getCompanyName());
        System.out.println();
    }
}
