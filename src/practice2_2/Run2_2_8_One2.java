package practice2_2;

/**
 * p93
 *
 * 与上个例子作对比，此处使用了不同的对象监视器，导致结果异步。
 */
public class Run2_2_8_One2 {
    public static void main(String[] args) {
        MyObject2_2_8_One_service service=new MyObject2_2_8_One_service();
        MyObject2_2_8_One_object object1=new MyObject2_2_8_One_object();
        MyObject2_2_8_One_object object2=new MyObject2_2_8_One_object();

        Thread2_2_8_One_A threadA=new Thread2_2_8_One_A(service,object1);
        threadA.setName("A");
        threadA.start();

        Thread2_2_8_One_B threadB=new Thread2_2_8_One_B(object2,service);
        threadB.setName("B");
        threadB.start();
    }
}
