import java.util.Collection ;
import java.util.ArrayList ;
import java.util.List ;

public class _1_ArrayList{
    public static void main(String [] args){
        System.out.println("ArrayList Program: ") ;

        Collection<Integer> list1 = new ArrayList<>() ;

        list1.add(1) ;
        list1.add(2) ;

        System.out.println() ;
        System.out.println("list1 be: ") ;
        System.out.println(list1) ;

        for(Object i : list1){

            int n = (Integer) i ;
            System.out.print(n + " ") ;
        }

        List<Integer> list2 = new ArrayList<>() ;

        list2.add(7) ;
        list2.add(8) ;
        list2.add(9) ;

        System.out.println() ;
        System.out.println("List2 be: ") ;
        System.out.println(list2) ;

        System.out.println("list2 elements at position 0 be: "+ list2.get(0)) ;
        System.out.println("index of elements 90 in list2 be: "+ list2.indexOf(90)) ;



    }
}