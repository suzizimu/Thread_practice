package practice2_2;

/**
 * p107
 *
 * 多线程的死锁
 */
public class Run2_2_12 {
    public static void main(String[] args) {
        try {
            Thread2_2_12 t1=new Thread2_2_12();
            t1.setFlag("a");

            Thread thread1=new Thread(t1);
            thread1.start();

            Thread.sleep(100);

            t1.setFlag("b");
            Thread thread2=new Thread(t1);
            thread2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
