// package 48_Thread_Race_Synchronized;
class Increment{
    int count ;

    public synchronized void increment_By_One(){
        count++ ;
    }
}
public class _1_Thread_Synchronized {
    public static void main(String[] args ){

        System.out.println("Thread Race or Thread Synchronized Program") ;

        Increment obj = new Increment() ;


        Runnable obj1 = () -> {
            for(int i=0; i<1000 ; i++){
                obj.increment_By_One() ;
                

            }
        } ;

        Runnable obj2 = ()->{
            for(int i=0 ; i<1000 ; i++){
                obj.increment_By_One() ;
            }
        } ;

        Thread t1 = new Thread(obj1) ;
        Thread t2 = new Thread(obj2) ;

        t1.start() ;
        t2.start() ;

        try{

            
            t1.join() ;
            t2.join() ;
        }
        catch(InterruptedException e){
            System.out.println("Problem While Joinnning Threads") ;
        }

        System.out.println(obj.count) ;

    }
    
}