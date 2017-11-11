package practice2_2;

/**
 * p72 synchronized方法的弊端
 *
 * 可能等待时间过长
 */
public class Run2_2_1 {
    public static void main(String[] args) {
        MyObject2_2_1 myObject=new MyObject2_2_1();

        Thread2_2_1_A threadA=new Thread2_2_1_A(myObject);
        threadA.start();

        Thread2_2_1_B threadB=new Thread2_2_1_B(myObject);
        threadB.start();
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        long beginTime=MyObject2_2_1_CommonUtils.beginTime1;
        if (MyObject2_2_1_CommonUtils.beginTime2 < MyObject2_2_1_CommonUtils.beginTime1){
            beginTime=MyObject2_2_1_CommonUtils.beginTime2;
        }
        long endTime=MyObject2_2_1_CommonUtils.endTime1;
        if (MyObject2_2_1_CommonUtils.endTime2 > MyObject2_2_1_CommonUtils.endTime1){
            endTime=MyObject2_2_1_CommonUtils.endTime2;
        }
        System.out.println("耗时： "+((endTime-beginTime)/1000));
    }
}
