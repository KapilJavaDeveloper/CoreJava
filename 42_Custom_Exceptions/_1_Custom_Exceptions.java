class It_Is_Zero extends Exception{
    public It_Is_Zero(String message){
        super(message) ;
    }
}
public class _1_Custom_Exceptions{
    public static void main(String [] args){
        System.out.println("Custom Exceptions Program") ;

        int j= 18 ;
        int i = 20 ;
        
        try{
            j = j/i ;

            if(j==0){
                throw new It_Is_Zero("Zero") ;
            }
        }
        catch(It_Is_Zero e){
            System.out.println(e +" : " + e.getMessage()) ;
        }

    }
}