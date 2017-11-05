package practice1_10;

public class MyThread1_10_4_B extends Thread{
    private int count=0;

    public int getCount(){
        return count;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            count++;
        }
    }
}
