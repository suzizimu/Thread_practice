package practice2_1;

public class Thread2_1_4_B2 extends Thread{

    private MyObject2_1_4_2 myObject;

    public Thread2_1_4_B2(MyObject2_1_4_2 myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodB();
    }
}
