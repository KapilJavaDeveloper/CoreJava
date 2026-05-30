class Student1{
    static String name = "Isskander" ;
}
public class _2_Static_Variable_Modifying_Static_Variable{
    public static void main(String [] args){
        System.out.println("Modifying static variable") ;

        Student1.name = "Kapil" ;

        Student1 obj1 = new Student1() ;
        Student1 obj2 = new Student1() ;

        System.out.println(obj1.name);
        System.out.println(obj2.name);

        obj2.name = "Isskander" ;
        
        System.out.println(obj1.name);
        System.out.println(obj2.name);


    }
}