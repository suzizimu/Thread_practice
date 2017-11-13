package practice2_2;

/**
 * p96
 * 关键字synchronized还可以应用在static静态方法上，是对当前的  *.java文件
 * 对应的Class类进行持锁。
 */
public class Run2_2_9_One {
    public static void main(String[] args) {
        Thread2_2_9_One_A threadA=new Thread2_2_9_One_A();
        threadA.setName("A");
        threadA.start();

        Thread2_2_9_One_B threadB=new Thread2_2_9_One_B();
        threadB.setName("B");
        threadB.start();
    }
}
