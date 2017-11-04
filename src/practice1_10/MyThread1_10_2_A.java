package practice1_10;

import java.util.Random;

public class MyThread1_10_2_A extends Thread{

    @Override
    public void run() {
        super.run();
        long beginTime=System.currentTimeMillis();

        long addResult=0;
        for (int j=0;j<10;j++){
            for (int i=0;i<50000;i++){
                Random random=new Random();
                random.nextInt();
                addResult=addResult+i;
            }
        }

        long endTime=System.currentTimeMillis();
        System.out.println("★★★★★threadA use time="+(endTime-beginTime));
    }
}
