package practice3_1;

public class MyObject3_1_5 {
    public void testMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("begin wait()");
                lock.wait();
                System.out.println("    end wait()");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("出现异常了，因为呈wait状态的线程被interrupt了！");
        }
    }
}
