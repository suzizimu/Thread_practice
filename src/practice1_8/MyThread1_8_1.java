package practice1_8;

public class MyThread1_8_1 extends Thread{
    private long i=0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            i++;
        }
    }
}
