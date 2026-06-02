// package 24_Anonymous_Object;


class Student{
    public Student(){
        System.out.println("Student Object is created.") ;
    }

    public void display(){
        System.out.println("Display Object of Student Class") ;
    }
}
public class Anonymous_Object {
    public static void main(String [] args){
        System.out.println("Anonymous Object Program--------------->") ;

        new Student() ; // Anonymous Object is created
        new Student().display() ; // Anonymous Object is calling display() method 

    }
    
}
