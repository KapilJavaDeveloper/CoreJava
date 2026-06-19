import java.util.List ;
import java.util.Arrays;
import java.util.stream.Stream ;
public class StreamApi{
    public static void main(String [] args){
        System.out.println("Stream Api Program.") ;

        List<Integer> list = Arrays.asList(2,5,6,7 , 90 , 45) ;

        Stream<Integer> s1 = list.stream() ;
        Stream<Integer> s2 = s1.filter(n-> n%2==0) ;
        Stream<Integer> s3 = s2.map(n-> n*2) ;
        int result1 = s3.reduce(0,(c,e)-> c+e) ;

        System.out.println("Result result1 be: " + result1) ;

        Stream<Integer> s10 = list.stream() ;
        int result2 = s10.filter(n-> n%2==0).map(n-> n*2).reduce(0,(c,e)-> c+e) ;

        System.out.println("Result result2 be: " + result2) ;


    }
}