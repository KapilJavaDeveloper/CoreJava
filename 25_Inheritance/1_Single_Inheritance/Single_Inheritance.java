// package 25_Inheritance.1_Single_Inheritance;

class Animal{
    String place ="Zoo" ;
}
class Dog extends Animal{
    
}
public class Single_Inheritance {
    public static void main(String [] args){
        System.out.println("Single Inheritance in Java") ;

        Dog obj = new Dog() ;

        System.out.println(obj.place) ;
    }
    
}
