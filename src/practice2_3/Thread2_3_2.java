package practice2_3;


public class Thread2_3_2 implements Runnable{
     private boolean isContinuePrint=true;

    //返回值属性
    public boolean isContinuePrint(){
        return isContinuePrint;
    }

    //赋值
    public void setContinuePrint(boolean isContinuePrint) {
        this.isContinuePrint = isContinuePrint;
    }

    //打印
    public void printStringMethod(){
        try {
            while (isContinuePrint==true){
                System.out.println("run printStringMethod threadName="+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
