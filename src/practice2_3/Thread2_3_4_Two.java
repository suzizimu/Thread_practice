package practice2_3;

public class Thread2_3_4_Two extends Thread{
    volatile public static int count;

    //注意一定要加static关键字
    //这样synchronized与static锁的内容就是Thread2_3_4_Two.class类了
    //也就达到同步的效果了
    synchronized
    private static void addCount(){
        for (int i=0;i<100;i++){
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run() {
        super.run();
        addCount();
    }
}
