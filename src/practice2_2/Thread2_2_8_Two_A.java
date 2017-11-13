package practice2_2;

public class Thread2_2_8_Two_A extends Thread {
    private MyObject2_2_8_Two_object object;
    private  MyObject2_2_8_Two_service service;

    public Thread2_2_8_Two_A(MyObject2_2_8_Two_object object, MyObject2_2_8_Two_service service) {
        super();
        this.object = object;
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
