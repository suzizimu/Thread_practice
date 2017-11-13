package practice2_2;

public class Thread2_2_8_Two_B extends Thread{
    private MyObject2_2_8_Two_object object;


    public Thread2_2_8_Two_B(MyObject2_2_8_Two_object object) {
         super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
