package practice2_2;

/**
 * p97
 * synchronized关键字加到static静态方法上是给Class类上锁，
 * 而synchronized关键字加到非static静态方法上是给对象上锁。
 * 【会造成异步：持有锁不同】
 */
public class Run2_2_9_Two {
    public static void main(String[] args) {
        MyObject2_2_9_Two service=new MyObject2_2_9_Two();

        Thread2_2_9_Two_A threadA=new Thread2_2_9_Two_A();
        threadA.setName("A");
        threadA.start();

        Thread2_2_9_Two_B threadB=new Thread2_2_9_Two_B();
        threadB.setName("B");
        threadB.start();

        Thread2_2_9_Two_C threadC=new Thread2_2_9_Two_C(service);
        threadC.setName("C");
        threadC.start();
    }
}
