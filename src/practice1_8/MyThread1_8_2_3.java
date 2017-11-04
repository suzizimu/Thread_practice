package practice1_8;

public class MyThread1_8_2_3 extends Thread {
    private int i=0;

    @Override
    public void run() {
        super.run();
        while (true){
            i++;
            System.out.println("i= "+i);
        }
    }
}
