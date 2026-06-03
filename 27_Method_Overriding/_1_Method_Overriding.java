// package 27_Method_Overriding;

class Parent{
    void display(){
        System.out.println("Parent Class display") ;
    }
}
class Child extends Parent{
    void display(){
        System.out.println("Child Class display") ;
    }
}
public class _1_Method_Overriding {
    public static void main(String [] args){
        System.out.println("Method overriding") ;

        Child obj = new Child() ;
        obj.display() ;
    }
    
}
