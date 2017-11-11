package practice2_2;

import java.util.ArrayList;
import java.util.List;

public class MyObject2_2_7_Four {
    private List  list=new ArrayList();

    synchronized
    public void add(String data){
        list.add(data);
    }

    synchronized
    public int getSize(){
        return list.size();
    }
}
