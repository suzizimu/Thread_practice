package practice2_2;

/**
 * p117
 *
 * 只要对象不变，即使对象的属性被改变，运行的结果还时同步。
 */
public class Run2_2_16_Two {
    public static void main(String[] args) {
        try {
            MyObject2_2_16_Two service=new MyObject2_2_16_Two();
            MyObject2_2_16_Two_UserInfo userInfo=new MyObject2_2_16_Two_UserInfo();

            Thread2_2_16_Two_A threadA=new Thread2_2_16_Two_A(service,userInfo);
            threadA.setName("a");
            threadA.start();

            Thread.sleep(50);

            Thread2_2_2_16_Two_B threadB=new Thread2_2_2_16_Two_B(service,userInfo);
            threadB.setName("b");
            threadB.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
