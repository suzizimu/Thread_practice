package practice1_8;

/**
 * p40 使用suspend（）和resume()方法 独占锁的另一种情况
 *
 * 要注意println()里面自带锁
 */
public class Run1_8_2_3 {
    public static void main(String[] args) {
        try {
            MyThread1_8_2_3 thread=new MyThread1_8_2_3();

            thread.start();
            Thread.sleep(1000);
            thread.suspend();//注意：此时并不会输出 下面这条语句了，因为暂停方法，用在了MyThread中的println()里面了【有锁】
            System.out.println("main end!");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
