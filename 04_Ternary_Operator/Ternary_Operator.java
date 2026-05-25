// package 04_Ternary_Operator;

public class Ternary_Operator {
    public static void main(String [] args){
        int n = 90 ;
        int result = 0 ;
        String res = "" ;

        result = n%2==0 ? 10 : 20 ;

        res = n%2==0 ? "even" : "odd"  ;
        
        System.out.println(result) ;
        System.out.println(res) ;
    }
    
}
