package practice1_5;

/**
 *
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread1 myThread1=new MyThread1();
        System.out.println("begin ="+System.currentTimeMillis());
        myThread1.run();//此处直接调用，则为同步不为异步。只有调用run（)方法后，才走后面的程序。
        System.out.println("end ="+System.currentTimeMillis());
    }
}
