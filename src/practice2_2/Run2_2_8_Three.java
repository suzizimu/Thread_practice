package practice2_2;

/**
 * p95
 * 当其它线程执行X对象方法里面的synchronized（this）代码块时也呈现同步效果
 */
public class Run2_2_8_Three {
    public static void main(String[] args) {
        MyObject2_2_8_Three_service service=new MyObject2_2_8_Three_service();
        MyObject2_2_8_Three_object object=new MyObject2_2_8_Three_object();

        Thread2_2_8_Three_A threadA=new Thread2_2_8_Three_A(object,service);
        threadA.setName("A");
        threadA.start();

        Thread2_2_8_Three_B threadB=new Thread2_2_8_Three_B(object);
        threadB.setName("B");
        threadB.start();
    }

}
