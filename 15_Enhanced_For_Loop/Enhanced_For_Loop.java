// package 15_Enhanced_For_Loop;

public class Enhanced_For_Loop {

    String name;
    String place ;
    public static void main(String [] args){
        System.out.println("Enhanced For Loop") ;

        int[] arr = {3 ,4,5,6,7,3,2,1} ;

        for(int m : arr){
            System.out.print(m + " ") ;
        }

        Enhanced_For_Loop obj1 = new Enhanced_For_Loop();
        obj1.name= "Isskander" ;
        obj1.place = "Greater Noida" ;

        Enhanced_For_Loop obj2 = new Enhanced_For_Loop() ;
        obj2.name= "Isskander Isskander"  ;
        obj2.place = "Alpha 1" ;

       

        Enhanced_For_Loop[] arr1 = new Enhanced_For_Loop[2] ;

        arr1[0] = obj1 ;
        arr1[1] = obj2 ;

        System.out.println() ;

        for(Enhanced_For_Loop m : arr1){
            System.out.println(m.name + " : " + m.place) ;
        }

    }
    
}
