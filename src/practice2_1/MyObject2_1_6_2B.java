package practice2_1;

public class MyObject2_1_6_2B extends MyObject2_1_6_2A {

    synchronized
    public void operateISubMethod(){
        try {
            while(i>0){
                i--;
                System.out.println("children print i="+i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
