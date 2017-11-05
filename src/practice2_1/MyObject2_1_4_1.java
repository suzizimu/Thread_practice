package practice2_1;

public class MyObject2_1_4_1 {

    synchronized public void methodA(){
        try{
            System.out.println("begin methodA threadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
