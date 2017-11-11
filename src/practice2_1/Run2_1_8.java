package practice2_1;

/**
 * p70 同步不具有继承性
 *
 * 在子类方法添加synchronized关键字才可同步。
 */
public class Run2_1_8 {
    public static void main(String[] args) {
        MyObject2_1_8_children children=new MyObject2_1_8_children();

        Thread2_1_8_A threadA=new Thread2_1_8_A(children);
        threadA.setName("A");
        threadA.start();

        Thread2_1_8_B threadB=new Thread2_1_8_B(children);
        threadB.setName("B");
        threadB.start();

    }
}
