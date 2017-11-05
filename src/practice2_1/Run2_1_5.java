package practice2_1;

/**
 * p63 脏读
 *
 *虽然在赋值时进行了同步，但在取值是有可能出现一些意想不到的意外，这种情况就是脏读。
 * 发生脏读的情况是在读取实例变量时，此值已经被其他线程更改过了
 */
public class Run2_1_5 {
    public static void main(String[] args) {
        try {
            MyObject2_1_5 myObject=new MyObject2_1_5();

            Thread2_1_5 thread=new Thread2_1_5(myObject);
            thread.start();
            Thread.sleep(200);//打印结果受此值大小影响

            myObject.getValue();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
