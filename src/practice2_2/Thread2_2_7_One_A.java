package practice2_2;

public class Thread2_2_7_One_A extends Thread{

    private MyObject2_2_7_One myObject;

    public Thread2_2_7_One_A(MyObject2_2_7_One myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.setUsernamePassword("a","aa");
    }
}
