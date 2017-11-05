package practice1_10;

/**
 * p49
 * 优先级高的运行的快
 */
public class Run1_10_4 {
    public static void main(String[] args) {
        try {
            MyThread1_10_4_A threadA=new MyThread1_10_4_A();
            threadA.setPriority(Thread.NORM_PRIORITY-3);
            threadA.start();

            MyThread1_10_4_B threadB=new MyThread1_10_4_B();
            threadB.setPriority(Thread.NORM_PRIORITY+3);
            threadB.start();

            Thread.sleep(200000);
            threadA.stop();
            threadB.stop();

            System.out.println("a="+threadA.getCount());
            System.out.println("b="+threadB.getCount());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
