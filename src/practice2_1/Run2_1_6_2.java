package practice2_1;

/**
 * p67
 *
 * 可重入锁也支持在父子类继承的环境中
 */
public class Run2_1_6_2 {
    public static void main(String[] args) {
        Thread2_1_6_2 thread=new Thread2_1_6_2();
        thread.start();
    }
}
