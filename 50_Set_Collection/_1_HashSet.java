// package 50_Set_Collection;
import java.util.Set ;
import java.util.HashSet ;
public class _1_HashSet {
    public static void main(String [] args){
        System.out.println("It is a HashSet Program.") ;

        Set<Integer> set = new HashSet<>() ;

        set.add(62) ;
        set.add(54) ;
        set.add(82) ;
        set.add(21) ;

        System.out.println("Set be : " + set) ; 

    }
    
}
