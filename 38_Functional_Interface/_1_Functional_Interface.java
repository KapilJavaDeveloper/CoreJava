// package 38_Functional_Interface;

@FunctionalInterface
interface functional_interface{
    void display() ;

}
public class _1_Functional_Interface {

    public static void main(String [] args){

        functional_interface obj = new functional_interface(){
            public void display(){
                System.out.println("Anonymous Class implements functional interface.") ;

            }
        } ;

        obj.display() ;

    }
    
}  
