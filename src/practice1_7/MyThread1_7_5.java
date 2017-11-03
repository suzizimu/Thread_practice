package practice1_7;

/**
 *p32 能停止的线程----暴力停止
 *
 */
public class MyThread1_7_5 extends Thread{
    private int i=0;

    @Override
    public void run() {
        super.run();
        try {
            while (true){
                i++;
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
