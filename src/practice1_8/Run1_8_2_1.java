package practice1_8;

/**
 * p38 suspend与resume方法的缺点---独占
 * 两个方法，如果使用不当，极易造成公共的同步对象的独占，使其他线程
 * 无法访问公共同步对象
 *
 * 示例1
 */
public class Run1_8_2_1 {
    public static void main(String[] args) {
        try {
            final SynchronizedObject1_8_2_1 object=new SynchronizedObject1_8_2_1();

            Thread thread1=new Thread(){
                @Override
                public void run() {
                    super.run();
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();//此时已经进入 暂停的状态，且有独占锁。
            Thread.sleep(1000);

            Thread thread2=new Thread(){
                @Override
                public void run() {
                    super.run();
                    System.out.println("thread2启动了，但进入不了printString()方法！");
                    System.out.println("因为printString()方法试a线程锁定并且永远suspend暂停了！");
                    object.printString();
                }
            };
            thread2.start();

        }catch (InterruptedException e){

        }
    }
}
