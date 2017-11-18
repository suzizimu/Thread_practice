package practice2_2;

public class Thread2_2_11_A extends Thread {
    private MyObject2_2_11 service;

    public Thread2_2_11_A(MyObject2_2_11 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodA();
    }
}
