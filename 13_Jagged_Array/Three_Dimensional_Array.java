// package 13_Jagged_Array;

public class Three_Dimensional_Array {
    public static void main(String [] args){
        System.out.println("Three dimensional Array");

        int[][][] arr1 = new int[2][][] ;

        arr1[0] = new int[3][] ;
        arr1[1] = new int[4][] ;

        arr1[0][0] = new int[2] ;
        arr1[0][1] = new int[3] ;
        arr1[0][2] = new int[1] ;

        arr1[1][0] = new int[2] ;
        arr1[1][1] = new int[3] ;
        arr1[1][2] = new int[4] ;
        arr1[1][3] = new int[8] ;


        for(int i=0 ; i<arr1.length ; i++){
            for(int j=0 ; j<arr1[i].length ; j++){
                for(int z=0 ; z<arr1[i][j].length ;z++){
                    arr1[i][j][z] = (int)(Math.random()*100) ;


                }
            }
        }

        System.out.println("Array be: ") ;

        for(int[][] n: arr1){
            for(int m[]: n){
                for(int e: m){
                    System.out.print(e+ " ") ;
                }
                System.out.println() ;
            }
            System.out.println() ;

        }

      
        


    }
    
}
