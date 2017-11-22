package practice3_1;

public class Thread3_1_3_One_A extends Thread {
    private Object lock;

    public Thread3_1_3_One_A(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock){
                System.out.println("开始 wait time="+System.currentTimeMillis());
                lock.wait();
                System.out.println("结束 wait time="+System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
