package practice2_3;

import java.util.concurrent.atomic.AtomicLong;

public class MyObject2_3_6 {
    public static AtomicLong aiRef=new AtomicLong();

    //synchronized
    public void addNum(){
        System.out.println(Thread.currentThread().getName()+"加了100之后的值是："+aiRef.addAndGet(100));
        aiRef.addAndGet(1);//加1操作
    }
}
