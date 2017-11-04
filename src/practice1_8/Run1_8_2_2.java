package practice1_8;

/**
 * p39 主要与1-8-2-3做对比
 */
public class Run1_8_2_2 {
    public static void main(String[] args) {
        try {
            MyThread1_8_2_2 thread=new MyThread1_8_2_2();

            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end!");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
