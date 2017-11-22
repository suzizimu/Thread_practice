package practice3_1;

public class Thread3_1_5 extends Thread {
    private Object lock;

    public Thread3_1_5(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        MyObject3_1_5 service=new MyObject3_1_5();
        service.testMethod(lock);
    }
}
