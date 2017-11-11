package practice2_1;

/**
 * p68
 * 当一个线程执行的代码出现异常时，其所持有的锁会自动释放
 */
public class Run2_1_7 {

    public static void main(String[] args) {
        try {
            MyObject2_1_7 myObject=new MyObject2_1_7();

            Thread2_1_7_A threadA=new Thread2_1_7_A(myObject);
            threadA.setName("a");
            threadA.start();

            Thread.sleep(500);

            Thread2_1_7_B threadB=new Thread2_1_7_B(myObject);
            threadB.setName("b");
            threadB.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
