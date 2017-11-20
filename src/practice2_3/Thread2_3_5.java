package practice2_3;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread2_3_5 extends Thread{
    private AtomicInteger count=new AtomicInteger(0);

    @Override
    public void run() {
        super.run();
        for (int i=0;i<10000;i++){
            System.out.println(count.incrementAndGet());
        }
    }
}
