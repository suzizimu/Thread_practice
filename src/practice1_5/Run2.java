package practice1_5;

public class Run2 {
    public static void main(String[] args) {
        MyThread2 myThread2=new MyThread2();
        System.out.println("begin ="+System.currentTimeMillis());
        myThread2.start();//用线程调用，所以为异步执行。随机性
        System.out.println("end ="+System.currentTimeMillis());

    }


}
