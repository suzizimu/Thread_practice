package practice1_7;

/**
 * P34  释放锁的不良后果
 * 使用stop()释放锁将会给数据造成不一致性的结果
 */
public class Run1_7_7 {
    public static void main(String[] args) {
        try {
            SynchronizedObject1_7_7 object=new SynchronizedObject1_7_7();
            MyThread1_7_7 thread=new MyThread1_7_7(object);

            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername()+" "+object.getPassword());
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
