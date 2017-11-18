package practice2_2;

public class MyObject2_2_16_Two {
    public void serviceMethodA(MyObject2_2_16_Two_UserInfo userInfo){
        synchronized (userInfo) {
            try {
                System.out.println(Thread.currentThread().getName());
                userInfo.setUsername("abcabcabc");
                Thread.sleep(3000);
                System.out.println("end! time=" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
