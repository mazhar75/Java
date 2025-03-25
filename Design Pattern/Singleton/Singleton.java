public class Singleton{
     public static Singleton instance = null;
     private Singleton(){};
     public static Singleton getInstance(){
         if(instance == null){
            System.out.println("Called");
            instance = new Singleton();
         }
         return instance;
     }
}