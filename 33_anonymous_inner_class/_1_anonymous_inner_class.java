abstract class Parent{
    abstract void display() ;
}
public class _1_anonymous_inner_class {
    public static void main(String [] args){

        Parent obj = new Parent(){

            @Override
            void display(){
                System.out.println("Anonymous inner class") ;
            }
        } ;
        obj.display() ;
    }
    
}
