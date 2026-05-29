// package 13_Jagged_Array;

public class Jagged_Array {
    public static void main(String [] args){

        int[][] arr1 = new int[3][] ;

        arr1[0] = new int[3] ;
        arr1[1] = new int[4] ;
        arr1[2] = new int[2] ;


                for(int i=0 ; i<arr1.length ;i++){
            for(int j=0 ; j<arr1[i].length ;j++){
                arr1[i][j] = (int)(Math.random()*10) ; 
            }
        
        }

        System.out.println("Jagged array be: ") ;

        for(int[] n : arr1){
            for(int m:n){
                System.out.print(m + " ") ;

            }
            System.out.println() ;
        }





    }
    
}
