package practice2_2;

public class MyObject2_2_8_Two_object {

    synchronized
    public void speedPrintString(){
        System.out.println("speedPrintString_____getLock time="
                        +System.currentTimeMillis()+" runt ThreadName="+Thread.currentThread().getName());
        System.out.println("================");
        System.out.println("speedPrintString releaseLock time="+System.currentTimeMillis()
                        +" run ThreadName="+Thread.currentThread().getName());
    }
}
