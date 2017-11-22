package practice3_1;

/**
 * p143
 * 方法wait（）锁释放
 */
public class Run3_1_4_One {
    public static void main(String[] args) {
        Object lock=new Object();
        Thread3_1_4_One_A threadA=new Thread3_1_4_One_A(lock);
        threadA.start();

        Thread3_1_4_One_B threadB=new Thread3_1_4_One_B(lock);
        threadB.start();
    }
}
