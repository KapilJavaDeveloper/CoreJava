// package 46_MutilThread;

class A1 extends Thread{

    public void run(){
        for(int i=0 ; i<100 ; i++){
            System.out.println("A") ;

        }
    }

}

class B extends Thread{

    public void run(){

        for(int i=0 ; i<100 ; i++){
            System.out.println("B") ;

            try{

                Thread.sleep(10) ;
            }
            catch(InterruptedException e){
                System.out.println("Exception occur while sleeping a Thread") ;
            }
        }
    }
}

public class _2_Thread_Priorities_Sleep {

    public static void main(String [] args){

        A obj1 = new A() ;
        B obj2 = new B() ;

        obj1.setPriority(Thread.MAX_PRIORITY) ;

        obj1.start() ;
        obj2.start() ;

    }
    
}
