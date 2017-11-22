package practice2_3;

public class Thread2_3_7_A extends Thread{
    private MyObject2_3_7 service;

    public Thread2_3_7_A(MyObject2_3_7 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.runMethod();
    }
}
