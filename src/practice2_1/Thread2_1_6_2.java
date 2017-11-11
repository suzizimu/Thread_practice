package practice2_1;

public class Thread2_1_6_2 extends Thread{
    @Override
    public void run() {
        super.run();
        MyObject2_1_6_2B children=new MyObject2_1_6_2B();
        children.operateISubMethod();
    }
}
