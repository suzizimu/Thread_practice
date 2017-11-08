package practice2_1;

public class Thread2_1_6_1 extends Thread{
    @Override
    public void run() {
        super.run();
        MyObject2_1_6_service service=new MyObject2_1_6_service();
        service.service1();
    }
}
