// package 55_map_filter_reduce;

import java.util.List ;
import java.util.Arrays ;
import java.util.stream.Stream ;
public class _3_reduce {
    public static void main(String [] args){
        System.out.println("Reduce method Program") ;

        List<Integer> list = Arrays.asList(1,2,3) ;

        int result = list.stream().reduce(0,(c,e)-> c+e) ;

        System.out.println("Result be: "+ result) ;



    }
    
}
