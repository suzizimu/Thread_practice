package practice2_2;

public class Thread2_2_6_B extends Thread{
    private MyObject2_2_6 myObject;

    public Thread2_2_6_B(MyObject2_2_6 myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.otherMethod();
    }
}
