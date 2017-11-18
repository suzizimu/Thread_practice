package practice2_2;

/**
 * p109
 * 内置类
 */
public class Run2_2_13_One {
    public static void main(String[] args) {
        MyObject2_2_13_One publicClass=new MyObject2_2_13_One();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername()+" "+publicClass.getPassword());

        MyObject2_2_13_One.PrivateClass privateClass=publicClass.new PrivateClass();//实例化内置类
        privateClass.setAddress("addressValue");
        privateClass.setAge("ageValue");
        System.out.println(privateClass.getAddress()+" "+privateClass.getAge());

    }
}
