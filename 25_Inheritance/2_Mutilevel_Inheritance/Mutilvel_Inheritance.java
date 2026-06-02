// package 25_Inheritance.2_Mutilevel_Inheritance;

class Animal{
    void meth1(){
        System.out.println("I am Animal") ;
    }
}

class Dog extends Animal{
    void meth2(){
        System.out.println("I am a Dog") ;
    }
}
class Puppy extends Dog{
    void meth3(){
        System.out.println("I am Puppy") ;
    }
}
public class Mutilvel_Inheritance {
    public static void main(String [] args){
        System.out.println("Mutilvel Inheritance") ;

        Puppy obj = new Puppy() ;

      obj.meth1() ;
      obj.meth2() ;
      obj.meth3() ;
    }
    
}
