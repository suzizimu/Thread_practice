package practice2_2;

public class Thread2_2_8_One_A extends Thread{
    private MyObject2_2_8_One_service service;
    private MyObject2_2_8_One_object object;

    public Thread2_2_8_One_A(MyObject2_2_8_One_service service, MyObject2_2_8_One_object object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
