package practice2_2;

/**
 *p89
 *
 * 出现了了“脏读”，原因是：连个线程以异步的方式返回list参数的size()大小
 */
public class Run2_2_7_Four {
    public static void main(String[] args) {
        try {
            MyObject2_2_7_Four myObject=new MyObject2_2_7_Four();

            Thread2_2_7_Four_A threadA=new Thread2_2_7_Four_A(myObject);
            threadA.setName("A");
            threadA.start();

            Thread2_2_7_Four_B threadB=new Thread2_2_7_Four_B(myObject);
            threadB.setName("B");
            threadB.start();

            Thread.sleep(6000);
            System.out.println("listSize="+myObject.getSize());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
