package practice3_1;

public class Thread3_1_3_Two_A extends Thread {
    private Object lock;

    public Thread3_1_3_Two_A(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock){
                if (MyObject3_1_3_Two.size()!=5){
                    System.out.println("wait begin"+System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end"+System.currentTimeMillis());
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
