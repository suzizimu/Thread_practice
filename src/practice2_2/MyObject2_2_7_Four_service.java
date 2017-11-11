package practice2_2;

public class MyObject2_2_7_Four_service {
    public MyObject2_2_7_Four addServiceMethod(MyObject2_2_7_Four list,String data){
        try {
//            synchronized (list){   解决脏读的办法：由于list参数对象在项目中是一份实例，是单例的。而且也
//                                    正需要对list参数的getSize()方法做同步的调用
                if (list.getSize()<1){
                    Thread.sleep(2000);
                    list.add(data);
                }
//            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return list;
    }
}
