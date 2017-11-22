package practice2_3;

/**
 * p130 synchronized代码块有volatile同步的功能
 *
 * 演示的是会执行异步一异步死循环。
 * 解决方法：1.在变量处添加volatile
 *           2.用同不代码块
 */
public class Run2_3_7 {
    public static void main(String[] args) {
        try {
            MyObject2_3_7 service=new MyObject2_3_7();

            Thread2_3_7_A threadA=new Thread2_3_7_A(service);
            threadA.start();

            Thread.sleep(1000);

            Thread2_3_7_B threadB=new Thread2_3_7_B(service);
            threadB.start();
            System.out.println("已经发起停止的命令了！");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
