package practice1_8;

public class MyObject1_8_3 {
    private String username="1";
    private String password="11";

    public void setValue(String username,String password){
        this.username=username;
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("停止a线程！");
            Thread.currentThread().suspend(); //此时暂停则，后续的代码不再进行
        }
        this.password=password;
    }

    public void printUsernamePassword(){
        System.out.println(username+" "+password);
    }
}
