package practice2_2;

public class Thread2_2_16_Two_A extends Thread{
    private MyObject2_2_16_Two service;
    private MyObject2_2_16_Two_UserInfo userInfo;

    public Thread2_2_16_Two_A(MyObject2_2_16_Two service, MyObject2_2_16_Two_UserInfo userInfo) {
        super();
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodA(userInfo);
    }
}
