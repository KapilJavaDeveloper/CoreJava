import java.util.List ;
import java.util.ArrayList ;
import java.util.Comparator;
import java.util.Collections ;
public class _1_Comparator_Interface{
    public static void main(String [] args){
        System.out.println("Comparator Interface.") ;

        Comparator<Integer> com = new Comparator<Integer>(){

            public int compare(Integer i , Integer j){
                if(i%10 > j%10){
                    return 1 ;
                }
                return -1 ;
            }

        } ;

        List<Integer> list = new ArrayList<>() ;

        list.add(78) ;
        list.add(84) ;
        list.add(79) ;
        list.add(91) ;

        Collections.sort(list , com) ;

        System.out.println("List be: " + list) ;

    }
}
