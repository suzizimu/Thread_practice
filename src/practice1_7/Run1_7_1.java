package practice1_7;

/**
 * p23停不了的线程
 */
public class Run1_7_1 {
    public static void main(String[] args) {
        try {
            MyThread myThread=new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("main catch");
        }
        System.out.println("end!");

    }
}
