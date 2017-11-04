package practice1_8;

/**
 * p40
 * suspend()与resume方法的缺点--不同步
 * 使用这两个方法时也容易出现因为线程的暂停而导致数据不同步的情况
 */
public class Run1_8_3 {
    public static void main(String[] args) {
        try {
            final MyObject1_8_3  myobject=new MyObject1_8_3();

            Thread thread1=new Thread(){
                @Override
                public void run() {
                    super.run();
                    myobject.setValue("a","aa");
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(500);

            Thread thread2=new Thread(){
                @Override
                public void run() {
                    super.run();
                    myobject.printUsernamePassword();
                }
            };
            thread2.start();

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
