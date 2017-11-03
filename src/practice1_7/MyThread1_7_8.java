package practice1_7;

public class MyThread1_7_8 extends Thread{
    @Override
    public void run() {
        super.run();
        while (true){
            if(this.isInterrupted()){
                System.out.println("停止了");
                return;
            }
            System.out.println("timer= "+System.currentTimeMillis());
        }
    }
}
