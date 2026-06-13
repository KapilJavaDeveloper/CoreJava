// package 47_Runnable_Interface;

public class _2_Thread_Implementation_By_Runnable_interface_using_lambda_expression {
    public static void main(String [] args){
        System.out.println("Thread Implementation By Ruunable interface using lambda expression.") ;

        Runnable obj1 = ()-> {
            for(int i=0; i<5 ; i++){
                System.out.println("A") ;
            }
        } ;

        Runnable obj2 = ()->{
            for(int i=0; i<5 ; i++){
                System.out.println("B") ;
            }
        } ;

        Thread t1 = new Thread(obj1) ;
        Thread t2 = new Thread(obj2) ;

        t1.start() ;
        t2.start() ;


    }

    
}
