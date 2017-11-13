package practice2_2;

public class Thread2_2_8_Three_B extends Thread {
    private MyObject2_2_8_Three_object object;

    public Thread2_2_8_Three_B(MyObject2_2_8_Three_object object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
