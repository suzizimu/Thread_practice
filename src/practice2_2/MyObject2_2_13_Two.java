package practice2_2;

public class MyObject2_2_13_Two {
    static private String username;
    static private String password;

    static
    class PrivateClass{
        private String age;
        private String address;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public  String getUsername() {
        return username;
    }

    public  void setUsername(String username) {
        MyObject2_2_13_Two.username = username;
    }

    public  String getPassword() {
        return password;
    }

    public  void setPassword(String password) {
        MyObject2_2_13_Two.password = password;
    }
}
