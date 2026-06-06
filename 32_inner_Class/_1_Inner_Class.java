// package 32_inner_Class;

class Parent{
    int data = 23 ;
    void display(){
        System.out.println("Parent Class") ;
    }

    class Child{

        void display(){
            System.out.println("Child class") ;
        }

    }
}
public class _1_Inner_Class {
    public static void main(String [] args){

        Parent obj1 = new Parent() ;
        obj1.display() ;

        Parent.Child obj2 = obj1.new Child() ;

        obj2.display()  ;

    }
    
}
