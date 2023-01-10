package Com.Singleton;

public class SingletonDemo {

    private static SingletonDemo singletonDemo;

   private  SingletonDemo( ){


   }

    public  static  SingletonDemo getInstance(String s){
       if(singletonDemo==null)
//           ?using thread safe?
           synchronized (SingletonDemo.class){
           singletonDemo=new SingletonDemo();
        singletonDemo=new SingletonDemo();}
       return singletonDemo;

    }




}
