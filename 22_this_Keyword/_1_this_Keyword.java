// package 22_this_Keyword;

class Student1{
    int id ;
    String name ;

    public Student1(){
        this(1,"Isskander") ;

    }

    public Student1(int id , String name){
        this.id = id ;
        this.name = name ;
        System.out.println(this.id+ ": " + this.name) ;
    }
}
public class _1_this_Keyword {
    public static void main(String [] args){
        System.out.println("this keyword") ;

        Student1 obj = new Student1() ;
    }
    
}
