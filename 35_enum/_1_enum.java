// package 35_enum;

enum Day{

    Monday ,
    Tuesday ,
    Wednesday ,
    Thursday ,
    Friday ,
    Saturday ,
    Sunday

}

public class _1_enum {
    public static void main(String [] args){

        System.out.println("enum Program in Java") ; 

        Day obj = Day.Thursday ;

        System.out.println(obj) ;

        switch(obj){
            case Monday:
            System.out.println("It is Monday") ;
            break ;

            case Tuesday:
            System.out.println("It is Tuesday") ;
            break ;

            case Wednesday:
            System.out.println("It is Wednesday") ;
            break ;

            case Thursday:
            System.out.println("It is Thurday") ;
            break ;

            case Friday:
            System.out.println("It is Friday") ;
            break ;

            case Saturday:
            System.out.println("It is Saturday") ;
            break ;

            case Sunday:
            System.out.println("It is Sunday") ;
            break ;

            default:
            System.out.println("Unknown Day") ;
        }


    }
    
}
