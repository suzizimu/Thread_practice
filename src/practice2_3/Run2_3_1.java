package practice2_3;

/**
 * p119
 * 死循环
 */
public class Run2_3_1 {
    public static void main(String[] args) {
        MyObject2_3_1 object=new MyObject2_3_1();
        object.printStringMethod();
        System.out.println("我要停止它！ stopThread="+Thread.currentThread().getName());
        object.setContinuePrint(false);
    }
}
