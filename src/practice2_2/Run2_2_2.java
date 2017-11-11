package practice2_2;

/**
 * p74 synchronized同步代码块的使用
 *
 *
 */
public class Run2_2_2 {
    public static void main(String[] args) {
        MyObject2_2_2 myObject=new MyObject2_2_2();

        Thread2_2_2_A threadA=new Thread2_2_2_A(myObject);
        threadA.setName("a");
        threadA.start();

        Thread2_2_2_B threadB=new Thread2_2_2_B(myObject);
        threadB.setName("b");
        threadB.start();
    }
}
