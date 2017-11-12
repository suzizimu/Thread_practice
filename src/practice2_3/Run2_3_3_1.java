package practice2_3;

/**
 * p121 解决异步死循环
 *
 * 关键字volatile的作用是强制从公共堆栈中取得变量的值，而不是从线程私有数据栈中取得变量的值
 *
 */
public class Run2_3_3_1 {
    public static void main(String[] args) throws InterruptedException { ;
        Thread2_3_3_1 thread=new Thread2_3_3_1();
        thread.start();
        Thread.sleep(1000);
        thread.setRunning(false);
        System.out.println("已经赋值为false");
    }
}
