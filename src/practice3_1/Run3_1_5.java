package practice3_1;

/**
 * p147
 * 当线程呈wait（）状态时，调用线程对象的interrupt（）方法时会出现InterruptedException异常
 */
public class Run3_1_5 {
    public static void main(String[] args) {
        try {
            Object lock=new Object();
            Thread3_1_5 thread=new Thread3_1_5(lock);
            thread.start();

            Thread.sleep(5000);
            thread.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
