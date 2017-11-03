package practice1_7;

/**
 * p35 使用return 停止线程
 * 将方法interrupt()与return（）集合使用也能实现停止线程的结果
 *
 * 不过还是建议“抛异常”解决【1_7_3示例】
 */
public class Run1_7_8 {
    public static void main(String[] args) {
        try {
            MyThread1_7_8 thread=new MyThread1_7_8();

            thread.start();
            Thread.sleep(2000);
            thread.interrupt();//

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
