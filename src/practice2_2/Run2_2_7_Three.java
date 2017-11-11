package practice2_2;

/**
 * p87
 * 验证：多个线程调用同一个方法是随机的
 */
public class Run2_2_7_Three {
    public static void main(String[] args) {
        MyObject2_2_7_Three myObject=new MyObject2_2_7_Three();

        Thread2_2_7_Three_A threadA=new Thread2_2_7_Three_A(myObject);
        threadA.setName("A");
        threadA.start();

        Thread2_2_7_Three_B threadB=new Thread2_2_7_Three_B(myObject);
        threadB.setName("B");
        threadB.start();
    }
}
