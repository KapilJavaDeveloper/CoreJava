// package 54_forEach_Loop;

import java.util.function.Consumer ;
import java.util.List ;
import java.util.Arrays;
public class _3_forEachLoop {

      public static void main(String [] args){
        System.out.println("for Each Loop Program") ;

        Consumer<Integer> con = n-> System.out.print(n + " ") ;
            
        List<Integer> list = Arrays.asList(6,3,9,1) ;

        list.forEach(con) ;

    }
    
}
