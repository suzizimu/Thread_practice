package practice2_1;

public class MyObject2_1_2 {

    private int num=0;//实例变量！！！

    synchronized public void addI(String username){//加上synchronized可以使线程同步。
        try {
            if (username.equals("a")){
                num=100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else{
                num=200;
                System.out.println("b set over！");
            }
            System.out.println(username+" num="+num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
