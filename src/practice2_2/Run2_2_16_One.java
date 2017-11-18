package practice2_2;

/**
 * p115
 *
 * 锁对象的改变
 */
public class Run2_2_16_One {
    public static void main(String[] args) throws InterruptedException {
        MyObject2_2_16_One service=new MyObject2_2_16_One();

        Thread2_2_16_One_A threadA=new Thread2_2_16_One_A(service);
        threadA.setName("A");


        Thread2_2_16_One_B threadB=new Thread2_2_16_One_B(service);
        threadB.setName("B");

        threadA.start();
        Thread.sleep(50);//因为50毫秒过后线程B取得的锁是'456‘

                            //若去掉Thread.sleep，则线程A和线程B持有的锁都是“123".结果改变为同步
        threadB.start();
    }
}
