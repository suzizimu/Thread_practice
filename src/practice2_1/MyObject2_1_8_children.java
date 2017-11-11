package practice2_1;

public class MyObject2_1_8_children extends MyObject2_1_8_father{

    @Override
    synchronized
    public  void serviceMethod() {
        super.serviceMethod();
        try {
            System.out.println("int children 下一步 sleep begin threadName="+Thread.currentThread().getName()
                            +" time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int children 下一步 sleep end threadName="+Thread.currentThread().getName()
                            +" time="+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
