// package 30_Typecasting;

class Animal{
    void sound(){
        System.out.println("Animal Sound") ;
    }
}
class Dog extends Animal{
    void sound2(){
        System.out.println("Dog sound") ;
    }
}
public class Upcasting_DownCasting {
    public static void main(String [] args){
        System.out.println("Upcasting Program") ;

        Animal obj1 = (Animal) new Dog() ;  // Upcasting
        obj1.sound() ;

        Dog obj2 =(Dog) obj1 ; // Downcasting
        obj2.sound2() ;

    
    }
    
}
