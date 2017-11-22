package practice2_3;

public class MyObject2_3_7 {
    //方法：1.volatile
    private boolean isContinueRun=true;

    public void runMethod(){
        //String anyString=new String();

        while (isContinueRun==true){
            //方法2：
//            synchronized (anyString){
//
//            }
        }
        System.out.println("停下来了！");
    }

    public void stopMethod(){
        isContinueRun=false;
    }
}
