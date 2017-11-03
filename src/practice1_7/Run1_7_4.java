package practice1_7;

public class Run1_7_4 {
    public static void main(String[] args) {
        try {
            MyThread1_7_4 thread=new MyThread1_7_4();

            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
