package practice2_2;

/**
 * P111
 * 静态内置类
 */
public class Run2_2_13_Two {
    public static void main(String[] args) {
        MyObject2_2_13_Two publicClass=new MyObject2_2_13_Two();
        publicClass.setPassword("passwordValue");
        publicClass.setUsername("usernameValue");
        System.out.println(publicClass.getUsername()+" "+publicClass.getPassword());

        MyObject2_2_13_Two.PrivateClass privateClass=new MyObject2_2_13_Two.PrivateClass();//静态内置类的实例化
        privateClass.setAddress("addressValue");
        privateClass.setAge("ageValue");
        System.out.println(privateClass.getAddress()+" "+privateClass.getAge());
    }
}
