package prototype.shallowclone;

/**
 * desc
 *原型模式
 * 浅复制
 * @author xutianzhe
 * @Date 2018/9/3
 **/
public class Test1 {
    /**
     * 浅复制的定义
     * 被复制的对象的所有变量都含有与原来对象相同的值
     * 而所有的对其他对象的引用仍指向原来的对象（如Resume对WorkExperience的引用）
     * @param args
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
