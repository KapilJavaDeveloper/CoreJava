import java.util.List ;
import java.util.ArrayList ;
import java.util.Collections ;


class Student1 implements Comparable<Student1>{

    String name ;
    int age ;

    public Student1(String name, int age){
        this.name = name ;
        this.age = age ;
    }

    public String toString(){
        return "Name be: " + this.name + " and age be: " + this.age ;
    }


    public int compareTo(Student1 that ){

        if( this.age> that.age){
            return 1 ;

        }
        return -1 ;

    }



}
public class _3_Comparable_Interface {
    public static void main(String [] args){

        System.out.println("Class extends Comparable Interface.") ;

        List<Student1> student = new ArrayList<>() ;

        student.add(new Student1("Isskander 1" , 67)) ;
        student.add(new Student1("Isskander 2", 56)) ;
        student.add(new Student1("Isskander 3", 46)) ;
        student.add(new Student1("Isskander 4", 12)) ;

        System.out.println("Students are : ") ;

        Collections.sort(student) ;

        for(Student1 s: student){
            System.out.println(s) ;

        }


    }
    
}
