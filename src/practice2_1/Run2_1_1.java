package practice2_1;

/**
 * p53 方法内的变量为线程安全
 *
 * 如果是方法内部的私有变量，则不存在“非线程安全”问题
 */
public class Run2_1_1 {
    public static void main(String[] args) {
        MyObject2_1_1 myObject2_1_1 =new MyObject2_1_1();

        Thread2_1_1_A threadA=new Thread2_1_1_A(myObject2_1_1);
        threadA.start();

        Thread2_1_1_B threadB=new Thread2_1_1_B(myObject2_1_1);
        threadB.start();
    }
}
