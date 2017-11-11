package practice2_2;

/**
 * p83
 *
 * 验证：在多个线程持有“对象监视器”为同一个对象的前提下，同一时间只有一个线程可以
 * 执行synchronized（非this对象x）同步代码块中的代码。
 */
public class Run2_2_7_One {
    public static void main(String[] args) {
        MyObject2_2_7_One myObject=new MyObject2_2_7_One();

        Thread2_2_7_One_A threadA=new Thread2_2_7_One_A(myObject);
        threadA.setName("A");
        threadA.start();

        Thread2_2_7_One_B threadB=new Thread2_2_7_One_B(myObject);
        threadB.setName("B");
        threadB.start();
    }
}
