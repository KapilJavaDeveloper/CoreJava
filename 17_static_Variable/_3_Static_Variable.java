// package 17_static_Variable;

class Demo{
    static int x  = 10 ;
    int y = 20  ;

}

public class _3_Static_Variable {
    public static void main(String [] args){
        System.out.println("Static Variable") ;

        Demo obj1 = new Demo() ;
        Demo obj2 = new Demo() ;

        obj1.x = 90 ;
        obj1.y = 100 ;

        System.out.println(obj2.x) ;
        System.out.println(obj2.y) ;

    }
    
}
