package practice3_1;

public class MyObject3_1_4_One {
    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait()");
                lock.wait();
                //Thread.sleep(40000);
                System.out.println("end wait()");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
