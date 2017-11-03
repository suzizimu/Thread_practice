package practice1_7;

public class Run1_7_4_2 {
    public static void main(String[] args) {
        MyThread1_7_4_2 thread=new MyThread1_7_4_2();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }
}
