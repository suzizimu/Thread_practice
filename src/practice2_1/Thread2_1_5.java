package practice2_1;

public class Thread2_1_5 extends Thread{

    private MyObject2_1_5 myObject;

    public Thread2_1_5(MyObject2_1_5 myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.setValue("B","BB");
    }
}
