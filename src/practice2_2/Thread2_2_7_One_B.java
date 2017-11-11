package practice2_2;

public class Thread2_2_7_One_B extends Thread{
    private MyObject2_2_7_One myObject;

    public Thread2_2_7_One_B(MyObject2_2_7_One myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.setUsernamePassword("b","bb");
    }
}
