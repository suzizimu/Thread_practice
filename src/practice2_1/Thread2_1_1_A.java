package practice2_1;

public class Thread2_1_1_A  extends Thread{
    private MyObject2_1_1 MyObject2_1_1;

    public Thread2_1_1_A(MyObject2_1_1 MyObject2_1_1) {
        this.MyObject2_1_1 = MyObject2_1_1;
    }

    @Override
    public void run() {
        super.run();
        MyObject2_1_1.addI("a");
    }
}
