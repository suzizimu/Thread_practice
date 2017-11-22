package practice3_1;

public class Thread3_1_3_Two_B extends Thread{
    private Object lock;

    public Thread3_1_3_Two_B(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock){
                for(int i=0;i<10;i++){
                    MyObject3_1_3_Two.add();
                    if (MyObject3_1_3_Two.size()==5){
                        lock.notify();
                        System.out.println("已发出通知！");
                    }
                    System.out.println("添加了"+(i+1)+"个元素！");
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
