package practice1_10;

import java.util.Random;

public class MyThread1_10_3_B extends Thread{
    @Override
    public void run() {
        super.run();
        long beginTime=System.currentTimeMillis();

        for (int i=0;i<1000;i++){
            Random random=new Random();
            random.nextInt();
        }

        long endTime=System.currentTimeMillis();
        System.out.println("☆☆☆☆☆thread B use time="+(endTime-beginTime));
    }
}
