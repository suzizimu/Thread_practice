package practice2_2;

/**
 * p112
 * 内置类与同步：内置类中有两个同步方法，但使用的是不同的锁，打印异步。
 */
public class Run2_2_14 {
    public static void main(String[] args) {
        final MyObject2_2_14.Inner inner=new MyObject2_2_14.Inner();//静态内置类实例化

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        },"A");

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        },"B");

        t1.start();
        t2.start();
    }
}
