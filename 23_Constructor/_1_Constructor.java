// package 23_Constructor;

class Student{
    String name ;
    int id ;

    public Student(){

        this("Unknown",1) ;
    }

    public Student(String name , int id){
        this.name = name ;
        this.id = id ;
    }
}
public class _1_Constructor {
    public static void main(String [] args){
        System.out.println("Constructors in Java ") ;

        Student obj1 = new Student() ;
        Student obj2 = new Student("Isskander" , 2) ;

        System.out.println(obj1.id + " : " + obj1.name) ;
        System.out.println(obj2.id + " : " + obj2.name) ;

    }
    
}
