package practice2_2;

public class Thread2_2_9_Three_B extends Thread {
    private MyObject2_2_9_Three service;

    public Thread2_2_9_Three_B(MyObject2_2_9_Three service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printB();
    }
}
