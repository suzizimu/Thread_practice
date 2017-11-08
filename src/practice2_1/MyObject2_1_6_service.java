package practice2_1;

public class MyObject2_1_6_service {
    synchronized
    public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized
    public void service2(){
        System.out.println("service2");
        service3();
    }

    synchronized
    public void service3(){
        System.out.println("service3");
    }
}
