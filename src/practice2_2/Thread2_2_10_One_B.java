package practice2_2;

public class Thread2_2_10_One_B extends Thread{
    private MyObject2_2_10_One service;

    public Thread2_2_10_One_B(MyObject2_2_10_One service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.print("AA");
    }
}
