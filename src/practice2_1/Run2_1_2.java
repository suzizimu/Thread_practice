package practice2_1;

/**
 * p55 实例变量非线程安全
 *
 * 如果多个线程共同访问1个对象中的实力变量，则有可能出现“非线程安全”问题
 * 【加上synchronized可以使线程同步。】
 */
public class Run2_1_2 {
    public static void main(String[] args) {
        MyObject2_1_2 myObject2_1_2 =new MyObject2_1_2();

        Thread2_1_2_A threadA=new Thread2_1_2_A(myObject2_1_2);
        threadA.start();

        Thread2_1_2_B threadB=new Thread2_1_2_B(myObject2_1_2);
        threadB.start();
    }
}
