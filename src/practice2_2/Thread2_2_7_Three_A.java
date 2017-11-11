package practice2_2;

import java.util.List;

public class Thread2_2_7_Three_A extends Thread {
    private MyObject2_2_7_Three myObject;

    public Thread2_2_7_Three_A(MyObject2_2_7_Three myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        for (int i=0;i<100000;i++){
            myObject.add("threadA"+(i+1));
        }
    }
}
