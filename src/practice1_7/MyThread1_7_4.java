package practice1_7;

/**
 * p30 在沉睡中停止
 */
public class MyThread1_7_4 extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("在沉睡中被停止！进入catch! "+this.isInterrupted());
            e.printStackTrace();
        }
    }
}
