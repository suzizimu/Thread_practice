package practice2_3;

public class Thread2_3_7_B extends Thread {
    private MyObject2_3_7 service;

    public Thread2_3_7_B(MyObject2_3_7 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.stopMethod();
    }
}
