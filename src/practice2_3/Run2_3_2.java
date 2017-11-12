package practice2_3;

/**
 * p120 解决同步死循环
 *
 * 运行在 -server服务器模式中64bit的JVM上时，会出现死循环【解决办法是使用volatile】
 */
public class Run2_3_2 {
    public static void main(String[] args){
        Thread2_3_2 thread_Runnable=new Thread2_3_2();

        new Thread(thread_Runnable).start();
        System.out.println("我要停止它！stopThread="+Thread.currentThread().getName());
        thread_Runnable.setContinuePrint(false);
    }
}
