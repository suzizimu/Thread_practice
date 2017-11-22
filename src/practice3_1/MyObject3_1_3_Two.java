package practice3_1;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.ArrayList;
import java.util.List;

public class MyObject3_1_3_Two {
    private static List list=new ArrayList();

    public static void add(){
        list.add("anyString");
    }

    public static int size(){
        return list.size();
    }
}
