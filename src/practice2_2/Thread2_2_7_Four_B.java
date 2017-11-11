package practice2_2;

public class Thread2_2_7_Four_B extends Thread {
    private MyObject2_2_7_Four myObject;

    public Thread2_2_7_Four_B(MyObject2_2_7_Four myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        MyObject2_2_7_Four_service service=new MyObject2_2_7_Four_service();
        service.addServiceMethod(myObject,"B");
    }
}
