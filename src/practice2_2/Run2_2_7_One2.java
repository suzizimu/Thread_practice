package practice2_2;

/**
 * p84  使用“synchronized(非this对象x)同步代码块”格式进行同步操作时，
 * 对象监视器必须是同一个对象。
 */
public class Run2_2_7_One2 {
    public static void main(String[] args) {
        MyObject2_2_7_One2 myObject=new MyObject2_2_7_One2();

        Thread2_2_7_One_A2 threadA=new Thread2_2_7_One_A2(myObject);
        threadA.setName("A");
        threadA.start();

        Thread2_2_7_One_B2 threadB=new Thread2_2_7_One_B2(myObject);
        threadB.setName("B");
        threadB.start();
    }
}
