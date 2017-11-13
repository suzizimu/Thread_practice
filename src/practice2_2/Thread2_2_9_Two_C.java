package practice2_2;

public class Thread2_2_9_Two_C extends Thread {
    private MyObject2_2_9_Two service;

    public Thread2_2_9_Two_C(MyObject2_2_9_Two service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printC();
    }
}
