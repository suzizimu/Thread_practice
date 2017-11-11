package practice2_2;

public class Thread2_2_7_Three_B extends Thread{
    private MyObject2_2_7_Three myObject;

    public Thread2_2_7_Three_B(MyObject2_2_7_Three myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        for(int i=0;i<100000;i++){
            myObject.add("threadB"+(i+1));
        }
    }
}
