package practice2_2;

public class MyObject2_2_4 {

    public void doLongTimeTask(){

        for (int i=0;i<100;i++){
            System.out.println("nosynchronized threadName="+Thread.currentThread().getName()
                                +" i="+(i+1));

        }

        System.out.println();

//        synchronized (this){
//            for (int i=0;i<100;i++){
//                System.out.println("synchronized threadName="+Thread.currentThread().getName()
//                                    +" i="+(i+1));
//            }
//        }
    }
}
