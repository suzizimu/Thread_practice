package practice2_2;

/**
 * p93
 * 当其它线程执行x对象中synchronized同步方法时呈同步效果
 */
public class Run2_2_8_Two {
    public static void main(String[] args) {
        MyObject2_2_8_Two_service service=new MyObject2_2_8_Two_service();
        MyObject2_2_8_Two_object object=new MyObject2_2_8_Two_object();

        Thread2_2_8_Two_A threadA=new Thread2_2_8_Two_A(object,service);
        threadA.setName("A");
        threadA.start();

        Thread2_2_8_Two_B threadB=new Thread2_2_8_Two_B(object);
        threadB.setName("B");
        threadB.start();
    }
}
