package practice2_2;

/**
 * p80 验证同步synchronized(this)代码块时锁定当前对象的
 *
 * 和synchronized方法一样，锁定单钱对象的。
 */
public class Run2_2_6 {
    public static void main(String[] args) throws InterruptedException {
        MyObject2_2_6 myObject=new MyObject2_2_6();

        Thread2_2_6_A threadA=new Thread2_2_6_A(myObject);
        threadA.start();

      Thread.sleep(100);

        Thread2_2_6_B threadB=new Thread2_2_6_B(myObject);
        threadB.start();
    }
}
