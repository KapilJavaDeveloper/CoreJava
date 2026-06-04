class Animal1{
    void sound(){
        System.out.println("Animal sound") ;
    }
}

class Dog1 extends Animal1{
    @Override
    void sound(){
        System.out.println("Dog sound") ;
    }
}

class Cat1 extends Animal1{
    @Override
    void sound(){
        System.out.println("Cat sound") ;

    }
}
public class _3_Dynamic_Dispatch {
    public static void main(String [] args){

        Animal1 obj = new Dog1()  ;
        obj.sound() ;

        obj = new Cat1() ;
        obj.sound() ;

    }
    
}
