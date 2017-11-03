package practice1_7;

/**
 * p27 isInterrupted()方法的演示：测试线程Thread对象是否已经是
 * 中断状态，但不清楚状态标志
 */
public class Run1_7_2_2 {
    public static void main(String[] args) {
        try {
            MyThread myThread=new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();

            System.out.println("是否停止1？="+myThread.isInterrupted());
            System.out.println("是否停止2？="+myThread.isInterrupted());
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
