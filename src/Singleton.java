//    1、单例类只能有一个实例。
//            2、单例类必须自己创建自己的唯一实例。
//            3、单例类必须给所有其他对象提供这一实例。

import java.time.Instant;

public class Singleton {

//    饿汉模式，没加锁，效率高,常用，容易产生垃圾对象
//    private  static Singleton singleton=new Singleton();
//    //构造函数为private，该类就不会被实例化
//    private Singleton(){}
//    public  static Singleton getInstance(){
//        return  singleton;
//    }

//懒汉模式
    private static  Singleton singleton;
    private  Singleton(){};
    public static synchronized Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return  singleton;
    }

    public  void test(){
        System.out.println("hhhh");
    }


}

