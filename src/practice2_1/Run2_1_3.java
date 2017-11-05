package practice2_1;

/**
 * p57 多个对象多个锁
 *
 * 关键字synchronized取得的锁都是对象锁，而不是把一段代码和方法（函数）当作锁。
 *
 */
public class Run2_1_3 {
    public static void main(String[] args) {
        MyObject2_1_2 add1=new MyObject2_1_2();
        MyObject2_1_2 add2=new MyObject2_1_2();

        Thread2_1_2_A threadA=new Thread2_1_2_A(add1);
        threadA.start();

        Thread2_1_2_B threadB=new Thread2_1_2_B(add2);
        threadB.start();
    }
}
