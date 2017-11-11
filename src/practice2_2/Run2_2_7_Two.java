package practice2_2;

/**
 * p85
 *
 * 使用“synchronized（非this对象x）同步代码块与synchronized方法是异步调用的效果
 *
 * 由于对象监视器不同，所以运行结果是异步的
 */
public class Run2_2_7_Two {
    public static void main(String[] args) {
        MyObject2_2_7_Two myObject=new MyObject2_2_7_Two();

        Thread2_2_7_Two_A threadA=new Thread2_2_7_Two_A(myObject);
        threadA.setName("A");
        threadA.start();

        Thread2_2_7_Two_B threadB=new Thread2_2_7_Two_B(myObject);
        threadB.setName("B");
        threadB.start();
    }
}
