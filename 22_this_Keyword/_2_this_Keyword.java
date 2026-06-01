// package 22_this_Keyword;


class Student2{
    int id ;
    void display(){

        display2(this) ;


    }
  
    void display2(Student2 obj){
        System.out.println("Object received with id : " + this.id) ;
    }
}
public class _2_this_Keyword {
    public static void main(String [] args){
        System.out.println("this keyword") ;

        Student2 obj = new Student2() ;
        obj.id = 1 ;
        obj.display() ;
    }
    
}
