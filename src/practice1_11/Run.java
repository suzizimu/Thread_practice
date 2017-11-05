package practice1_11;

/**
 * p50
 * 守护线程：当进程中不存在非守性线程了，则守护线程自动销毁。
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();

            thread.setDaemon(true);//守护线程

            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，也就是停止了！");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
