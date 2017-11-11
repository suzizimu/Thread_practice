package practice2_2;

public class Thread2_2_7_Four_A extends Thread{
    private MyObject2_2_7_Four myObject;


    public Thread2_2_7_Four_A(MyObject2_2_7_Four myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        MyObject2_2_7_Four_service service=new MyObject2_2_7_Four_service();
        service.addServiceMethod(myObject,"A");
    }
}
