public class _3_Multiple_try_catch{
    public static void main(String [] args){
        System.out.println("Mutiple try catch block") ;

        int[] nums= new int[5] ;

        int j = 20 ;
        int i = 10 ;

        String str = "" ;

        try{
            int divide = j/i ;

            System.out.println(nums[1]) ;
            // System.out.println(nums[5]) ;
            System.out.println(str.charAt(1)) ;

        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero") ;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of Bound") ;
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String is out of Bound") ;
        }




    }
}