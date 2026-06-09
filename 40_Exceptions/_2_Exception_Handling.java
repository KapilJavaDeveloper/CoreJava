// package 40_Exceptions;

public class _2_Exception_Handling {
    public static void main(String [] args){
        System.out.println("Exception Handling Program.") ;

        int a = 10 ;
        int b = 0 ;

        try{
            int result = a/b ;
            System.out.println("10/0 be: "+ result) ;

        }
        catch(Exception e){
            System.out.println(e) ;
        }
        System.out.println("Program Ends") ;
    }
    
}
