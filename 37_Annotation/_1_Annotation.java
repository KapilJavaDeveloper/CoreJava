// package 37_Annotation;
class Parent {
    void display(){
        System.out.println("Parent Class") ;
    }
}

class Child extends Parent{

    @Override 
    void display(){
        System.out.println("Child Class") ;
    }
}
public class _1_Annotation {

    public static void main(String [] args){
        System.out.println("Annotation in Java") ;

        Parent obj = new Child() ;
        obj.display() ;
    }
    
}
