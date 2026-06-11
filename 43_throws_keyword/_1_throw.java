class Loader{


    public void load() throws ClassNotFoundException{
        Class.forName("calc") ;
    }
}
public class _1_throw {

    static{
        System.out.println("_1_throw class Loaded") ;
    }
    public static void main(String [] args){
        System.out.println("throw keyword in Java.") ;

        Loader obj = new Loader() ;

        try{

            obj.load() ;

        }
        catch(ClassNotFoundException e){
            System.out.println("Class Not Found") ;

        }


    }
    
}
