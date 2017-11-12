package practice2_2;

public class Thread2_2_8_One_B extends Thread {
    private MyObject2_2_8_One_object object;
    private MyObject2_2_8_One_service service;

    public Thread2_2_8_One_B(MyObject2_2_8_One_object object, MyObject2_2_8_One_service service) {
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
