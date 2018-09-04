package prototype.deepclone;


/**
 * desc
 *原型模式
 * 深复制
 * @author xutianzhe
 * @Date 2018/9/3
 **/
public class Test1 {
    /**
     * 如果workExperience里还有一个对象引用，则还会出现一层浅复制。深复制需要自己定义深到几层
     */
    public static void main(String[] args){
        Resume personA = new Resume("Trent");
        personA.setPersonableInfo("男",23);
        personA.setWorkExperience("2000-2005","xxxx公司");

        Resume personB = personA.clone();
        personB.setWorkExperience("2006-2010","yyyy企业");

        Resume personC = personA.clone();
        personC.setPersonableInfo("男",24);
        personC.setWorkExperience("2012-1018","zzzz集团");

        personA.dispaly();
        personB.dispaly();
        personC.dispaly();
    }
}
