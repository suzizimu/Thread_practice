package practice2_2;

public class Thread2_2_2_B extends Thread{

    private MyObject2_2_2 myObject;

    public Thread2_2_2_B(MyObject2_2_2 myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.serviceMethod();
    }
}
