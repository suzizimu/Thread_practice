package practice2_2;

/**
 * p101
 * 同步synchronized（class）代码块的作用其实和synchronized static 方法的作用一样
 */
public class Run2_2_9_Four {
    public static void main(String[] args) {
        MyObject2_2_9_Four service1=new MyObject2_2_9_Four();
        MyObject2_2_9_Four service2=new MyObject2_2_9_Four();

        Thread2_2_9_Four_A threadA=new Thread2_2_9_Four_A(service1);
        threadA.setName("A");
        threadA.start();

        Thread2_2_9_Four_B threadB=new Thread2_2_9_Four_B(service2);
        threadB.setName("B");
        threadB.start();
    }
}
