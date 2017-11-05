package practice2_1;

public class Thread2_1_1_B extends Thread {
    private MyObject2_1_1 myObject2_1_1;

    public Thread2_1_1_B(MyObject2_1_1 myObject2_1_1) {
        this.myObject2_1_1 = myObject2_1_1;
    }

    @Override
    public void run() {
        super.run();
        myObject2_1_1.addI("b");
    }
}
