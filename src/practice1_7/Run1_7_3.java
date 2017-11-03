package practice1_7;

public class Run1_7_3 {
    public static void main(String[] args) {
        try {
            MyThread1_7_3 thread=new MyThread1_7_3();

            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
