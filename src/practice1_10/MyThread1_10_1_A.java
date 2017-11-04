package practice1_10;

public class MyThread1_10_1_A extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("MyThreadA run priority="+this.getPriority());

        MyThread1_10_1_B threadB=new MyThread1_10_1_B();
        threadB.start();//在A线程里调用B线程
    }
}
