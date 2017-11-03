package practice1_5;

/**
 * sleep()的作用是在制定的毫秒数内让当前“正在执行的线程”休眠
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run threadName="+Thread.currentThread().getName()+" begin");
            Thread.sleep(2000);
            System.out.println("run threadName="+Thread.currentThread().getName()+" end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
