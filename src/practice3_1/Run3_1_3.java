package practice3_1;

/**
 * p138
 * notify()方法使用
 */
public class Run3_1_3 {
    public static void main(String[] args) {
        try {
            Object lock=new Object();

            Thread3_1_3_One_A threadA=new Thread3_1_3_One_A(lock);
            threadA.start();

            Thread.sleep(3000);

            Thread3_1_3_One_B threadB=new Thread3_1_3_One_B(lock);
            threadB.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
