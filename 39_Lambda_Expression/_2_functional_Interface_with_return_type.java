@FunctionalInterface
interface functional_Interface2{

    int add(int a, int b) ;

}
public class _2_functional_Interface_with_return_type {
    public static void main(String [] args){

        System.out.println("Functional Interface With Return Type") ;

        functional_Interface2 obj = (int i, int j)-> i+j ;

        System.out.println(obj.add(1,2)) ;

 
    }
    
}
