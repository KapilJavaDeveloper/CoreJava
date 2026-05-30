// package 17_static_Variable;

class Student {
    int rollNo ;
    String name ;

    static String college = "NIET"  ;

    public Student(int rollNo , String name){
        this.rollNo = rollNo ;
        this.name = name ;
    }

    void display(){
        System.out.println(rollNo + " " + name + " " + college) ;
    }
}

public class _1_Static_Variable {
    public static void main(String[] args){

        System.out.println("Static Variable ") ;

        Student obj1 = new Student(1, "Isskander") ;
        Student obj2 = new Student(2, "Isskander isskander") ;

        obj1.display() ;
        obj2.display() ;


    }
    
}
