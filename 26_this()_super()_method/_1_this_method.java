// package 26_this()_super()_method;


public class _1_this_method {

    public _1_this_method(){
        this(1) ;
        System.out.println("Default Parameterized constructor") ;
    }
    public _1_this_method(int a){
        this(1,2) ;
        System.out.println("One value parameterized constructor.") ;
    }
    public _1_this_method(int a , int b){
        System.out.println("Two value Parameterized constructor") ;
    }
    public static void main(String[] args){
        System.out.println("this method in Java") ;

        _1_this_method obj = new _1_this_method() ;


    }
    
}
