public class _1_throw {
    public static void main(String [] args){
        System.out.println("throw Program.") ;

        try{
            throw new Exception("Exception occurred") ;
        }
        catch(Exception e){
            System.out.println(e.getMessage()) ;
        }
    }
    
}