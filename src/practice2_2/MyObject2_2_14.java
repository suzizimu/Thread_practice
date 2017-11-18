package practice2_2;

public class MyObject2_2_14 {

    static
    class Inner{
        public void method1(){
            synchronized ("其他的锁"){
                for (int i=1;i<=10;i++){
                    System.out.println(Thread.currentThread().getName()+" i="+i);
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }

        synchronized
        public void method2(){
            for (int i=11;i<=20;i++){
                System.out.println(Thread.currentThread().getName()+" i="+i);
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
