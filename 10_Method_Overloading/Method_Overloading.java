public class Method_Overloading{

    public static int add(int a , int b){
        return (a+b) ;
    }
    public static double add(int a, int b, double c){
        return (a+b) ;
    }
    public static double add(int a , double c, int b){
        return a ; 
    }
    public static String add(double c , int a , int b){
        return "a" ;

    }
    public static void main(String [] args){
        System.out.println("Method Overloading ") ;
    }
}