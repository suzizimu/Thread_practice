package practice2_1;

public class Thread2_1_4_A extends Thread{

    private MyObject2_1_4_1 myObject;

    public Thread2_1_4_A(MyObject2_1_4_1 myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
