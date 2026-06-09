@FunctionalInterface
interface functional_Interface{
    void name(String Name) ;

}
public class _1_Lambda_Expression{
    public static void main(String [] args){
        System.out.println("Lambda Expression.") ;

        functional_Interface obj = (String name)->
                System.out.println("My name is "+ name) ;
            
        
        obj.name("Isskander") ;
    }
}
