// package 12_Mutidimensional_Array;

public class Multidimensional_Array {

    public static void main(String [] args){
        System.out.println("Mutidimensional Array") ;

        int[][] arr1 = new int[3][4]  ;

     
       

        for(int i=0; i<arr1.length ; i++){
            for(int j=0 ; j<arr1[0].length ; j++){

                arr1[i][j] = (int)(Math.random()*10) ;
               

            }
        }

        System.out.println("Array arr1 be: ") ;

        for(int i=0 ; i<arr1.length ; i++){ 
            for(int j=0 ; j<arr1[0].length ; j++){
                System.out.print(arr1[i][j]+ " ") ;

            }
            System.out.println() ;
        }

        

        System.out.println() ;
        System.out.println("Array arr1 by enhanced loop be: ") ;

        for(int n[]: arr1){

            for(int m: n){
                System.out.print(m + " ") ;
            }
            System.out.println() ;

        }

        
    }
    
}
