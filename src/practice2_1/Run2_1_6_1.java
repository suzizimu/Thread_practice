package practice2_1;

/**
 * p65
 * sychronized锁重入
 *
 * 可重入锁：自己可以再次获取自己的内部锁。
 */
public class Run2_1_6_1 {
    public static void main(String[] args) {
        Thread2_1_6_1 thread=new Thread2_1_6_1();
        thread.start();
    }
}
