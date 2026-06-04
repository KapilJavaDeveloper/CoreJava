class Animal{
    void sound(){
        System.out.println("Animal makes sound") ;
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog makes sound") ;
    }
}

class Cat extends Animal{

    @Override
    void sound(){
        System.out.println("Cat makes sound") ;
    }
}
public class _2_Runtime_Polymorphism {
    public static void main(String[] args){

        Animal obj1 = new Dog() ;
        Animal obj2 = new Cat() ;

        obj1.sound() ;
        obj2.sound() ;

    }
    
}
