package practice2_2;

public class Thread2_2_7_Two_A extends Thread{
    private MyObject2_2_7_Two myObject;

    public Thread2_2_7_Two_A(MyObject2_2_7_Two myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.a();
    }
}
