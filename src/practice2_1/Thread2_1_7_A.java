package practice2_1;

public class Thread2_1_7_A extends Thread{

    private MyObject2_1_7 myObject;

    public Thread2_1_7_A(MyObject2_1_7 myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.testMethod();
    }
}
