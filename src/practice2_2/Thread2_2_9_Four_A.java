package practice2_2;

public class Thread2_2_9_Four_A extends Thread {
    private MyObject2_2_9_Four service;

    public Thread2_2_9_Four_A(MyObject2_2_9_Four service) {
        super();
        this.service=service;
    }

    @Override
    public void run() {
        super.run();
        service.printA();
    }
}
