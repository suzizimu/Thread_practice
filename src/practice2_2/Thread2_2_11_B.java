package practice2_2;

public class Thread2_2_11_B extends Thread {
    private MyObject2_2_11 service;

    public Thread2_2_11_B(MyObject2_2_11 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodB();
    }
}
