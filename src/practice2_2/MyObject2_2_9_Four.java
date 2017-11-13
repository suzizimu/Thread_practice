package practice2_2;

public class MyObject2_2_9_Four {

    public static void printA(){
        synchronized (MyObject2_2_9_Four.class){
            try {
                System.out.println("线程名称为："+Thread.currentThread().getName()+
                                "在"+System.currentTimeMillis()+"进入printA");
                Thread.sleep(3000);
                System.out.println("线程名称为："+Thread.currentThread().getName()+
                        "在"+System.currentTimeMillis()+"离开printA");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void printB(){
        synchronized (MyObject2_2_9_Four.class){
            System.out.println("线程名称为："+Thread.currentThread().getName()+
                    "在"+System.currentTimeMillis()+"进入printB");
            System.out.println("线程名称为："+Thread.currentThread().getName()+
                    "在"+System.currentTimeMillis()+"离开printB");
        }
    }
}
