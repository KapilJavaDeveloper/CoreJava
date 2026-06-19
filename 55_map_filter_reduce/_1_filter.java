import java.util.List ;
import java.util.function.Predicate;
import java.util.Arrays ;
import java.util.stream.Stream ;
public class _1_filter {
    public static void main(String [] args){

        List<Integer> list = Arrays.asList(3,2,6,4) ;

        Predicate<Integer> p = new Predicate<>(){

            public boolean test(Integer n){
                if(n%2==0){
                    return true ;
                }
                return false ;
            }

        } ;

        Stream<Integer> s1 = list.stream().filter(p) ;
        int s2 = s1.reduce(0, (c,e) -> c+e) ;
        System.out.println("stream be: " + s2) ; 

      




    }

    
}
