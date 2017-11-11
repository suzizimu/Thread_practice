package practice2_2;

public class Thread2_2_4_A extends Thread{
    private MyObject2_2_4 myObject;

    public Thread2_2_4_A(MyObject2_2_4 myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.doLongTimeTask();
    }
}
