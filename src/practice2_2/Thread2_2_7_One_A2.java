package practice2_2;

public class Thread2_2_7_One_A2 extends Thread{
    private MyObject2_2_7_One2 myObject;

    public Thread2_2_7_One_A2(MyObject2_2_7_One2 myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.setUsernamePassword("a","aa");
    }
}
