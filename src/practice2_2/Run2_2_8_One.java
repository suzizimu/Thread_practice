package practice2_2;

/**
 * p91
 * 当多个线程同时执行synchronized（x){}同步代码块时呈同步效果
 *
 * 【同步的原因是使用了同一个“对象监视器”
 */
public class Run2_2_8_One {
    public static void main(String[] args) {
        MyObject2_2_8_One_service service=new MyObject2_2_8_One_service();
        MyObject2_2_8_One_object object=new MyObject2_2_8_One_object();

        Thread2_2_8_One_A threadA=new Thread2_2_8_One_A(service,object);
        threadA.setName("A");
        threadA.start();

        Thread2_2_8_One_B threadB=new Thread2_2_8_One_B(object,service);
        threadB.setName("B");
        threadB.start();
    }
}
