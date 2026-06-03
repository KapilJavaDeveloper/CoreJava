// package 26_this()_super()_method;
class Parent{
    public Parent(){
        System.out.println("Parent Class Default parameterized constructor") ;
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child Class Default parameterized constructor") ;

    }
}
public class _2_super_method {

    public static void main(String [] args){
        System.out.println("super method in Java") ;

        Child obj = new Child() ;
    }
    
}
