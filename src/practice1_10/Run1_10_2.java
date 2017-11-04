package practice1_10;

/**
 * p44
 * 优先级具有规则性：高优先级的线程总是大部分先执行完，但不代表高优先级的线程
 * 全部执行完。【当线程优先级差距很大时，谁先执行完和代码的调用顺序无关】
 */
public class Run1_10_2 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            MyThread1_10_2_A threadA=new MyThread1_10_2_A();
            threadA.setPriority(10);
            threadA.start();

            MyThread1_10_2_B threadB=new MyThread1_10_2_B();
            threadB.setPriority(1);
            threadB.start();
        }

    }

}
