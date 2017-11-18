package practice2_2;

public class MyObject2_2_11 {

//    synchronized
//    public void methodA(){
//        System.out.println("methodA begin");
//        boolean isContinueRun=true;
//
//        while (isContinueRun){
//        }
//        System.out.println("methodA end");
//    }
//
//    synchronized
//    public void methodB(){
//        System.out.println("methodB begin");
//        System.out.println("methidB end");
//    }

    //解决方案：
    Object object1=new Object();
    public void methodA(){
        synchronized (object1){
            System.out.println("methodA begin");
            boolean isContinueRun=true;
            while (isContinueRun){

            }
            System.out.println("methodA end");
        }
    }

    Object object2=new Object();
    public void methodB(){
        synchronized (object2){
            System.out.println("methodB begin");
            System.out.println("methodB begin");
        }
    }

}
