package practice2_2;

public class Thread2_2_10_One_A extends Thread {
    private MyObject2_2_10_One serivce;

    public Thread2_2_10_One_A(MyObject2_2_10_One serivce) {
        super();
        this.serivce = serivce;
    }

    @Override
    public void run() {
        super.run();
        serivce.print("AA");
    }
}
