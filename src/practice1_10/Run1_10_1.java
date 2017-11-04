package practice1_10;

/**
 * P43
 * 线程的优先级具有继承性，比如A线程启动B线程，则B线程的优先级与A是一样的。
 */
public class Run1_10_1 {
    public static void main(String[] args) {
        System.out.println("main thread begin priority="+Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority="+Thread.currentThread().getPriority());

        MyThread1_10_1_A threadA=new MyThread1_10_1_A();
        threadA.start();
    }
}
