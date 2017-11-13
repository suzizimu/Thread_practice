package practice2_2;

public class MyObject2_2_8_Three_service {
    public void testMethod1(MyObject2_2_8_Three_object object){
        synchronized (object){
            try {
                System.out.println("testMethod1____getLock time="
                        +System.currentTimeMillis()+" run ThreadName="
                        +Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethod1 releaseLock time="+
                        +System.currentTimeMillis()+" run ThreadName="
                        +Thread.currentThread().getName());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
