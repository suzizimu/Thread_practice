package practice2_2;

/**
 * p77 一半异步，一半同步
 * 【有些问题，怎么都同步呢？？？？？】
 */
public class Run2_2_4 extends Thread {

    public static void main(String[] args) {
        MyObject2_2_4 myObject=new MyObject2_2_4();

        Thread2_2_4_A threadA=new Thread2_2_4_A(myObject);
        threadA.start();

        Thread2_2_4_B threadB=new Thread2_2_4_B(myObject);
        threadB.start();
    }
}
