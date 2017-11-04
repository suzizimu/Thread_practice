package practice1_8;

/**
 * p36 暂停线程
 * suspend()方法【暂停线程】
 * resume()方法【恢复线程】
 */
public class Run1_8_1 {
    public static void main(String[] args) {
        try {
            MyThread1_8_1 thread=new MyThread1_8_1();

            thread.start();
            Thread.sleep(5000);

            //A段
            thread.suspend();
            System.out.println("A= "+System.currentTimeMillis()+" i="+thread.getI());
            Thread.sleep(5000);
            System.out.println("A= "+System.currentTimeMillis()+" i="+thread.getI());

            //B段
            thread.resume();
            Thread.sleep(5000);

            //C段
            thread.suspend();
            System.out.println("B= "+System.currentTimeMillis()+" i="+thread.getI());
            Thread.sleep(5000);
            System.out.println("B= "+System.currentTimeMillis()+" i="+thread.getI());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
