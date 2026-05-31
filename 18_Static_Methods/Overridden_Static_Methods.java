// package 18_Static_Methods;
class Animal{
    static void method(){
        System.out.println("Animal") ;
    }
}
class Dog extends Animal{
    static void method(){
        System.out.println("Dog") ;
    }
}
public class Overridden_Static_Methods {
    public static void main(String [] args){
    Animal obj = new Dog() ;
    obj.method() ;

    Dog obj1 = new Dog() ;
    obj1.method() ;

     Animal obj2 = new Animal() ;
    obj2.method() ;
      
    }
    
}
