// package 25_Inheritance.4_Mutiple_Inheritance;

class Animal1{
    String place="Zoo1"  ;
}
class Animal2{
    String place="Zoo2"  ;
}
class Dog extends Animal1 , Animal2{

}
public class Mutiple_Inheritance {
    public static void main(String [] args){
        System.out.println("Mutiple Inheritance") ;
        Dog obj = new Dog() ;
        System.out.println(obj.place) ;
    }
    
}
