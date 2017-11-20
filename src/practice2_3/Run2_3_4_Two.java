package practice2_3;

public class Run2_3_4_Two {
    public static void main(String[] args) {
        Thread2_3_4_Two[] threadArray=new Thread2_3_4_Two[100];
        for (int i=0;i<100;i++){
            threadArray[i]=new Thread2_3_4_Two();
        }

        for (int i=0;i<100;i++){
            threadArray[i].start();
        }
    }
}
