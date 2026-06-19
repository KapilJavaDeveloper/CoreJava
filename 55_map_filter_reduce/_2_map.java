// package 55_map_filter_reduce;

import java.util.List ;
import java.util.function.Function;
import java.util.Arrays ;
import java.util.stream.Stream ;
public class _2_map {
    public static void main(String [] args){
        System.out.println("Map method program.") ;

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7) ;

        Function<Integer, Integer> function = new Function<>(){

            public Integer apply(Integer n){
                return n*2 ;

            }

        } ;

        Stream<Integer> s1 = list.stream().map(function);

        int result = s1.reduce(0,(c,e)-> (c+e)) ;

        System.out.println("Stream Be: "+ result) ;


    }
    
}
