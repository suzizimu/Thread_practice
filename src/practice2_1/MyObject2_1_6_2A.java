package practice2_1;

public class MyObject2_1_6_2A {

    public int i=10;

    synchronized
    public void operateIMainMethod(){
        try {
            i--;
            System.out.println("father print i="+i);
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
