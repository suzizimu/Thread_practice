package practice3_1;

public class Thread3_1_4_One_A extends Thread {
    private Object lock;

    public Thread3_1_4_One_A(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        MyObject3_1_4_One service=new MyObject3_1_4_One();
        service.testMethod(lock);
    }
}
