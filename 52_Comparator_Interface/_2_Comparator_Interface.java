import java.util.List ;
import java.util.ArrayList ;
import java.util.Collections ;
import java.util.Comparator ;

class Student{

    String name ;
    int age ;

    public Student(String name, int age){
        this.name = name ;
        this.age = age ;
    }

    public String toString(){
        return "Name be: "+  this.name + " and age be: "+ this.age ;
    }
}
public class _2_Comparator_Interface {
    public static void main(String [] args){
        System.out.println("2 Comparator Interface Program.") ;

        List<Student> list = new ArrayList<>() ;

        Comparator<Student> com = new Comparator<>(){

            public int compare(Student i , Student j){

                if(i.age > j.age){
                    return 1 ;
                }
                return -1 ;

            }

        } ;

        list.add(new Student("Isskander 1", 28)) ;
        list.add(new Student("Isskander 2", 29));
        list.add(new Student("Isskander 3", 22)) ;
        list.add(new Student("Isskander 4",26)) ;

        Collections.sort(list ,com) ;

        for(Student s: list){
            System.out.println(s) ;
        }


    }
    
}
