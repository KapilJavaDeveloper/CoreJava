// package 14_Array_Of_Objects;

public class Array_Of_Objects {

    int rollno ;
    String name ;
    int marks ;
    
    public static void main(String [] args){
        System.out.println("Array of Object") ;

        Array_Of_Objects obj1 = new Array_Of_Objects() ;

        obj1.rollno = 1 ;
        obj1.name = "Isskander"  ;
        obj1.marks = 90 ;

        Array_Of_Objects obj2 = new Array_Of_Objects() ;

        obj2.rollno = 2 ;
        obj2.name = "Isskander Isskander" ;
        obj2.marks = 94 ;

        Array_Of_Objects obj3 = new Array_Of_Objects();

        obj3.rollno = 3 ;
        obj3.name = "Isskander Isskander Isskander"  ;
        obj3.marks = 98 ;

        Array_Of_Objects[] arr = new Array_Of_Objects[3] ;

        arr[0] = obj1 ;
        arr[1] = obj2 ;
        arr[2] = obj3 ;

        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i].rollno + ". " +arr[i].name + " : " + arr[i].marks) ;

        }

    }
    
}
