package practice2_3;

/**
 * p124 volatile非原子的特性
 *
 * 得到的结果并不是10000
 */
public class Run2_3_4_One {
    public static void main(String[] args) {
        Thread2_3_4_One[] threadArray=new Thread2_3_4_One[100];
        for (int i=0;i<100;i++){
            threadArray[i]=new Thread2_3_4_One();
        }

        for (int i=0;i<100;i++){
            threadArray[i].start();
        }
    }
}
