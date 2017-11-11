package practice2_1;

public class Thread2_1_8_A extends Thread {
    private MyObject2_1_8_children children;

    public Thread2_1_8_A(MyObject2_1_8_children children) {
        super();
        this.children = children;
    }

    @Override
    public void run() {
        super.run();
        children.serviceMethod();
    }
}
