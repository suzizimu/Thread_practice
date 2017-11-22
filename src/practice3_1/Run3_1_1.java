package practice3_1;

/**
 * p133
 * 不使用等待/通知机制实现线程间通信。
 */
public class Run3_1_1 {
    public static void main(String[] args) {
        MyObject3_1_1 service=new MyObject3_1_1();

        Thread3_1_1_A threadA=new Thread3_1_1_A(service);
        threadA.setName("A");
        threadA.start();

        Thread3_1_1_B threadB=new Thread3_1_1_B(service);
        threadB.setName("B");
        threadB.start();
    }
}
