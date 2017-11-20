package practice2_3;

public class Thread2_3_4_One extends Thread {
    volatile public static int count;

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
