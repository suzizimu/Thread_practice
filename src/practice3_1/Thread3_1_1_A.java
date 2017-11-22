package practice3_1;

public class Thread3_1_1_A extends Thread{
    private MyObject3_1_1 list;

    public Thread3_1_1_A(MyObject3_1_1 list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        try {
            for (int i=0;i<10;i++){
                list.add();
                System.out.println("添加了"+(i+1)+"个元素");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
