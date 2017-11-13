package practice2_2;

/**
 * p99
 * Class锁可以对类的所有对象实例起作用。
 */
public class Run2_2_9_Three {
    public static void main(String[] args) {
        MyObject2_2_9_Three service1=new MyObject2_2_9_Three();
        MyObject2_2_9_Three service2=new MyObject2_2_9_Three();

        Thread2_2_9_Three_A threadA=new Thread2_2_9_Three_A(service1);
        threadA.setName("A");
        threadA.start();

        Thread2_2_9_Three_B threadB=new Thread2_2_9_Three_B(service2);
        threadB.setName("B");
        threadB.start();
    }
}
