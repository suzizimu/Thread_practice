package practice2_2;

/**
 * p103
 * JVM具有String常量池缓存的功能
 *
 * 此处：因为String的两个值都是AA，两个线程持有相同的锁，所以造成线程B不能执行。
 */
public class Run2_2_10_One  {
    public static void main(String[] args) {
        MyObject2_2_10_One service=new MyObject2_2_10_One();

        Thread2_2_10_One_A threadA=new Thread2_2_10_One_A(service);
        threadA.setName("A");
        threadA.start();

        Thread2_2_10_One_B threadB=new Thread2_2_10_One_B(service);
        threadB.setName("B");
        threadB.start();
    }
}
