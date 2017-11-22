package practice3_1;

public class Thread3_1_1_B extends Thread{
    private MyObject3_1_1 list;

    public Thread3_1_1_B(MyObject3_1_1 list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        try {
            while (true){
                Thread.sleep(100);
                if (list.size()==5){
                    System.out.println("==5了，线程b要退出了！");
                    throw new InterruptedException();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
