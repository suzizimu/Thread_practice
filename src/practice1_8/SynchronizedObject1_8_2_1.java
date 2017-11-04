package practice1_8;

public class SynchronizedObject1_8_2_1 {

    synchronized public void printString(){
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永远 susupend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
