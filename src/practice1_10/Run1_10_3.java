package practice1_10;

/**
 * p47
 * 线程的有优先级还具有“随机性”，也就是优先级较高的线程不一定每一次都先执行完
 * 【线程优先级与打印顺序无关，他们的关系具有不确定性和随机性】
 */
public class Run1_10_3 {
    public static void main(String[] args) {
        for(int i=0;i<15;i++){
            MyThread1_10_3_A threadA=new MyThread1_10_3_A();
            threadA.setPriority(5);
            threadA.start();

            MyThread1_10_3_B threadB=new MyThread1_10_3_B();
            threadB.setPriority(6);
            threadB.start();
        }
    }
}
