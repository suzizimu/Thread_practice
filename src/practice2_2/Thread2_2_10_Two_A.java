package practice2_2;

public class Thread2_2_10_Two_A extends Thread {
    private MyObject2_2_10_Two service;

    public Thread2_2_10_Two_A(MyObject2_2_10_Two service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.print(new Object());
    }
}
