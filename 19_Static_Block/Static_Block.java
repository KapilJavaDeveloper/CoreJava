// package 19_Static_Block;

class Student{
    static String name = "Isskander"  ;
    
    static{
        System.out.println("Name be: "  + name) ;
    }

    public Student(){
        System.out.println("Default Constructor of Student class") ;
    }

    int id = 12 ;
    
    {
        System.out.println("Id of Student be: " + id) ;
    }  
    
}

public class Static_Block {
    public static void main(String [] args) throws Exception{

        Class.forName("Student") ;

        Student obj = new Student() ;


    }
    
}
