package practice2_2;

public class Thread2_2_4_B extends Thread{
    private MyObject2_2_4 myObject;

    public Thread2_2_4_B(MyObject2_2_4 myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.doLongTimeTask();
    }
}
