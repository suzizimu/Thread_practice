package practice1_7;

/** p33
 * 调用stop()方法是会抛出java.lang.ThreadDeath异常，但在通常的情况下，此异常不需要
 * 显示地捕捉
 */
public class MyThread1_7_6 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            this.stop();
        }catch (ThreadDeath e){
            System.out.println("进入了cathch()方法");
            e.printStackTrace();
        }

    }
}
