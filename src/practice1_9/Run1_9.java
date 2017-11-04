package practice1_9;

/**
 * p42
 * yield()方法，作用是放弃当前cpu资源，将它让给其它的任务去占用cpu执行时间。
 * 但放弃的时间不确定，有可能刚刚放弃，马上又获得cpu时间片。
 */
public class Run1_9 {
    public static void main(String[] args) {
        MyThread1_9 thread=new MyThread1_9();
        thread.start();
    }
}
