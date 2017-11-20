package practice2_3;

/**
 * p126 使用原子类进行i++操作
 *
 * 除了在i++操作时使用synchronized关键字实现同步外，还可以使用AtomicInteger原子类进行实现。
 *
 * 【它可以在没有锁的情况下做到线程安全】
 */
public class Run2_3_5 {
    public static void main(String[] args) {
        Thread2_3_5 countService=new Thread2_3_5();

        Thread t1=new Thread(countService);
        t1.start();

        Thread t2=new Thread(countService);
        t2.start();

        Thread t3=new Thread(countService);
        t3.start();

        Thread t4=new Thread(countService);
        t4.start();

        Thread t5=new Thread(countService);
        t5.start();

    }
}
