package practice1_7;

/**
 * p32 能停止的线程----暴力停止
 * 使用stop()
 */
public class Run1_7_5 {
    public static void main(String[] args) {
        try {
            MyThread1_7_5 thread=new MyThread1_7_5();

            thread.start();
            Thread.sleep(8000);
            thread.stop();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
