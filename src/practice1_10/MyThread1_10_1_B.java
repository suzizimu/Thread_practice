package practice1_10;

public class MyThread1_10_1_B extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread_B run priority="+this.getPriority());
    }
}
