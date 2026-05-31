class Employee{
    String name ;

    static void display(Employee emp){
        System.out.println("Name of the Enmployee be: " + emp.name) ;
    }

}
public class Static_Methods{
    public static void main(String [] args){
        System.out.println("Static Methods") ;

        Employee emp1  = new Employee() ;

        emp1.name = "Isskander"  ;

        Employee.display(emp1) ;
    }
}