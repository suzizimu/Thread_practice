package practice3_1;

/**
 * p140
 * notify()用法 ，执行后不立即释放锁。
 */
public class Run3_1_3_Two {
    public static void main(String[] args) {
        try {
            Object lock=new Object();
            Thread3_1_3_One_A threadA=new Thread3_1_3_One_A(lock);
            threadA.start();

            Thread.sleep(50);

            Thread3_1_3_Two_B threadB=new Thread3_1_3_Two_B(lock);
            threadB.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
