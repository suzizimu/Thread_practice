package practice1_7;

/**
 *
 */
public class MyThread1_7_7 extends Thread{
    private SynchronizedObject1_7_7 object;

    public MyThread1_7_7(SynchronizedObject1_7_7 object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.printString("b","bb");
    }
}
