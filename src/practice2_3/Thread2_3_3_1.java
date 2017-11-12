package practice2_3;

public class Thread2_3_3_1  extends Thread {
   //volatile
   private boolean isRunning=true;

    public boolean isRunning(){
        return isRunning;
    }

    public void setRunning(boolean isRunning){
        this.isRunning=isRunning;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("进入run了");
        while(isRunning==true){
            System.out.println("进入了while循环。");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("线程被停止了！");
    }
}
