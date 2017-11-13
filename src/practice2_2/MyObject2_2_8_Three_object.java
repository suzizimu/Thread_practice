package practice2_2;

public class MyObject2_2_8_Three_object {

    public void speedPrintString(){
        synchronized (this){
            System.out.println("speedPrintString_____getLock time="
                    +System.currentTimeMillis()+" runt ThreadName="+Thread.currentThread().getName());
            System.out.println("================");
            System.out.println("speedPrintString releaseLock time="+System.currentTimeMillis()
                    +" run ThreadName="+Thread.currentThread().getName());
        }
    }
}
