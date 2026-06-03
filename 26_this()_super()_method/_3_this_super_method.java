// package 26_this()_super()_method;

class Parent1{
    public Parent1(){
        this(1) ;
        System.out.println("Parent1 default Parameterized constructor.") ;
    }
    public Parent1(int a){
        System.out.println("Parent1 parameterized constructor") ;
    }
}

class Child1 extends Parent1{
    public Child1(){

        System.out.println("Child1 default Parameterized constructor") ;

    }
}
public class _3_this_super_method {
    public static void main(String[] args){
        System.out.println("this and super method in Java") ;

        Child1 obj = new Child1() ;

    }
    
}
