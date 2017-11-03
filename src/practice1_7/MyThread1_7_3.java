package practice1_7;

/**
 * p29 停止了线程，且如果for语句下面还有语句，不会继续运行
 */
public class MyThread1_7_3 extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500; i++) {
                Thread.sleep(100);
                System.out.println("i="+(i+1));
                if (this.isInterrupted()) {
                    System.out.println("已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
            }
            System.out.println("我在for下面");
         }catch (InterruptedException e){
                System.out.println("进入run()中的catch了");
                e.printStackTrace();
         }

    }
}

