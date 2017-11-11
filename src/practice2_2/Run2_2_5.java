package practice2_2;

/**
 * p78 synchronized代码块间的同步性
 *
 * 当一个线程访问object的一个synchronized(this）同步代码块时，其他线程对同一个object中
 * 所有其他synchronized(this)同步代码块的访问被堵塞
 */
public class Run2_2_5 {
    public static void main(String[] args) {
        MyObject2_2_5 myObject=new MyObject2_2_5();

        Thread2_2_5_A threadA=new Thread2_2_5_A(myObject);
        threadA.start();

        Thread2_2_5_B threadB=new Thread2_2_5_B(myObject);
        threadB.start();
    }
}
