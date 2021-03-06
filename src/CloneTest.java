/**
 * Created by 时光与你 on 2017/5/13.
 */
class mm implements Cloneable{
    private String name;

    public mm(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "姓名：" + this.name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();       //具体的克隆由父类完成
    }
}
public class CloneTest {
    /*
    克隆对象的使用
     */
    public static void main(String[] args) throws Exception{
        mm p1 = new mm("张三");
        mm p2 = (mm)p1.clone();
        p2.setName("李四");
        System.out.println("原始对象："+p1);
        System.out.println("克隆后的对象："+p2);
    }
}
