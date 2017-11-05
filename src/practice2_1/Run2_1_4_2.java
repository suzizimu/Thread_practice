package practice2_1;

/**
 * p61
 * 虽然A线程先持有了myObject对象的锁，但线程B完全可以异步调用非synchronized类型的方法
 */
public class Run2_1_4_2 {
    public static void main(String[] args) {
        MyObject2_1_4_2 myObject=new MyObject2_1_4_2();

        Thread2_1_4_A2 threadA=new Thread2_1_4_A2(myObject);
        threadA.setName("A");
        threadA.start();

        Thread2_1_4_B2 threadB=new Thread2_1_4_B2(myObject);
        threadB.setName("B");
        threadB.start();
    }
}
