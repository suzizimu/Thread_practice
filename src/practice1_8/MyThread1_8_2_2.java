package practice1_8;

public class MyThread1_8_2_2 extends Thread{
    private long i=0;

    @Override
    public void run() {
        super.run();
        while (true){
            i++;
        }
    }
}
