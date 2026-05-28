public class Creation_Of_Array{
    public static void main(String [] args){

        int[] arr1 = {1,2,3,4,5} ;

        int[] arr2 = new int[5] ;

        arr2[0] = 12 ;
        arr2[1] = 13 ;
        arr2[2] = 14 ;
        arr2[3] = 15 ;

        System.out.println("arr1 be: ") ;
        for(int i=0 ; i<arr1.length ; i++){
            System.out.print(arr1[i] + " ") ;
        }

        System.out.println() ;
        System.out.println("arr2 be: ") ;
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ") ;
        }





    }
}