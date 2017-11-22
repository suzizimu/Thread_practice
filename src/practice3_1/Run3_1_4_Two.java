package practice3_1;

/**
 * p145
 * 必须执行完notify()方法所在的同步synchronized代码块后才释放锁。
 */
public class Run3_1_4_Two {
    public static void main(String[] args) {
        Object lock=new Object();

        Thread3_1_4_Two_A threadA=new Thread3_1_4_Two_A(lock);
        threadA.start();

        Thread3_1_4_Two_B threadB=new Thread3_1_4_Two_B(lock);
        threadB.start();

        Thread3_1_4_Two_C threadC=new Thread3_1_4_Two_C(lock);
        threadC.start();
    }
}
