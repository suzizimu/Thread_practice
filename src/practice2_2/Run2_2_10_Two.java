package practice2_2;

/**
 * p104
 * 因此大多数的情况下，同步synchronized代码块都不实用String作为锁对象，而改用其他。
 *
 * 比如new Object()实例化一个Object对象，但它并不放入缓存中。
 */
public class Run2_2_10_Two {
    public static void main(String[] args) {
        MyObject2_2_10_Two service=new MyObject2_2_10_Two();

        Thread2_2_10_Two_A threadA=new Thread2_2_10_Two_A(service);
        threadA.setName("A");
        threadA.start();

        Thread2_2_10_Two_B threadB=new Thread2_2_10_Two_B(service);
        threadB.setName("B");
        threadB.start();
    }
}
