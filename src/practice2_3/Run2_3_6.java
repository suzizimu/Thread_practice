package practice2_3;

/**
 * p127 原子类也并不完全安全
 *
 * 按理说输出应该打印顺序出错
 * 【从而要在MyObject2_3_6相应方法前加synchronized保持同步】
 * 结果没错误。。。很是不解。
 */
public class Run2_3_6 {
    public static void main(String[] args) {
        try {
            MyObject2_3_6 service=new MyObject2_3_6();
            Thread2_3_6[] array=new Thread2_3_6[5];
            for (int i=0;i<array.length;i++){
                array[i]=new Thread2_3_6(service);
            }
            for (int i=0;i<array.length;i++){
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(service.aiRef.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
