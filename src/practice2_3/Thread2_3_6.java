package practice2_3;

public class Thread2_3_6 extends Thread{
    private MyObject2_3_6 serivce;

    public Thread2_3_6(MyObject2_3_6 serivce) {
        super();
        this.serivce = serivce;
    }

    @Override
    public void run() {
        super.run();
        serivce.addNum();
    }
}
