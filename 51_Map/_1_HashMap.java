// package 51_Map;
import java.util.Map ;
import java.util.HashMap ;
public class _1_HashMap {
    public static void main(String [] args){

        System.out.println("HashMap Program") ;
        Map<String , Integer> map = new HashMap<>() ;

        map.put("Isskander" , 90) ;
        map.put("Isskander Isskander" , 98) ;
        map.put("Isskander" , 99) ;
        map.put("Isskander" , 909) ;

        System.out.println("HashMap be: " + map) ;

        System.out.println("Keys of map are : ") ;
        System.out.println(map.keySet()) ;

        System.out.println("Values of map are : ") ;
        System.out.println(map.values()) ;


    }
    
}
