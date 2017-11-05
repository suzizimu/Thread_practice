package practice2_1;

/**
 *
 */
public class Run2_1_4_1 {
    public static void main(String[] args) {
        MyObject2_1_4_1 myObject=new MyObject2_1_4_1();

        Thread2_1_4_A threadA=new Thread2_1_4_A(myObject);
        threadA.setName("A");
        threadA.start();

        Thread2_1_4_B threadB=new Thread2_1_4_B(myObject);
        threadB.setName("B");
        threadB.start();
    }
}
