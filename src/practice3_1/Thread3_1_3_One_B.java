package practice3_1;

public class Thread3_1_3_One_B extends Thread {
    private Object lock;

    public Thread3_1_3_One_B(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock){
            System.out.println("开始 notify time="+System.currentTimeMillis());
            lock.notify();
            System.out.println("结束 notify time="+System.currentTimeMillis());
        }
    }
}
