package practice2_2;

public class Thread2_2_5_B extends Thread {
    private MyObject2_2_5 myObject;

    public Thread2_2_5_B(MyObject2_2_5 myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.serviceMethodB();
    }
}
