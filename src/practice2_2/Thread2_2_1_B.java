package practice2_2;

public class Thread2_2_1_B extends Thread{
    private MyObject2_2_1 myObject;

    public Thread2_2_1_B(MyObject2_2_1 myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        MyObject2_2_1_CommonUtils.beginTime2=System.currentTimeMillis();
        myObject.doLongTimeTask();
        MyObject2_2_1_CommonUtils.endTime2=System.currentTimeMillis();
    }
}
