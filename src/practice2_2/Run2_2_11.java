package practice2_2;

/**
 * P105
 * 同步方法容易造成死循环
 *
 * 解决方法：MyObject2_2_11 里面的另一种修改方案【用同步代码块】
 */
public class Run2_2_11 {
    public static void main(String[] args) {
        MyObject2_2_11 service=new MyObject2_2_11();

        Thread2_2_11_A threadA=new Thread2_2_11_A(service);
        threadA.start();

        Thread2_2_11_B threadB=new Thread2_2_11_B(service);
        threadB.start();
    }
}
