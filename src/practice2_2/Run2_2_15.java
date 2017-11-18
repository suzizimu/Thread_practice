package practice2_2;

/**
 * p113
 * 内置类与同步：同步代码块synchronized（class2）对class2上锁后，其他线程只能以同步的方法调用
 * class2中的静态同步方法
 */
public class Run2_2_15 {
    public static void main(String[] args) {
        final MyObject2_2_15.InnerClass1 in1=new MyObject2_2_15.InnerClass1();
        final MyObject2_2_15.InnerClass2 in2=new MyObject2_2_15.InnerClass2();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method1(in2);
            }
        },"T1");

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method2();
            }
        },"T2");

        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                in2.method1();
            }
        },"T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
