package practice2_1;

public class Thread2_1_2_B extends Thread {
    private MyObject2_1_2 myObject2_1_2;

    public Thread2_1_2_B(MyObject2_1_2 myObject2_1_2) {
        super();//调用父类的构造方法
        this.myObject2_1_2 = myObject2_1_2;
    }

    @Override
    public void run() {
        super.run();
        myObject2_1_2.addI("b");
    }
}
