package practice3_1;

public class Thread3_1_4_Two_C extends Thread {
    private Object lock;

    public Thread3_1_4_Two_C(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        MyObject3_1_4_Two service=new MyObject3_1_4_Two();
        service.synNotifyMethod(lock);
    }
}
