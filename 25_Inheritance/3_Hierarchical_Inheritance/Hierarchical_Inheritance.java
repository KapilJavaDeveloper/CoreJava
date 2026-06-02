// package 25_Inheritance.3_Hierarchical_Inheritance;

class Animal{
    String place = "Home"  ;
}

class Dog extends Animal{

}

class Cat extends Animal{

}
public class Hierarchical_Inheritance {
    public static void main(String [] args){
        System.out.println("Hierarchical Inheritance in Java") ;

        Dog obj1 = new Dog()  ;
        Cat obj2 = new Cat()  ;

        System.out.println("Dog lives in " + obj1.place) ;
        System.out.println("Cat lives in " + obj2.place) ;


    }
    
}
