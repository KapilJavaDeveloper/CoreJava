class A implements Runnable{

    @Override
    public void run(){

        for(int i=0 ; i<5 ; i++){
            System.out.println("A") ;
        }

    }

}

class B implements Runnable{
    @Override
    public void run(){

        for(int i=0 ; i<5 ; i++){
            System.out.println("B") ;

        }

    }
}
public class _1_Thread_Implementation_By_Runnable_Interface {
    public static void main(String [] args){
        System.out.println("Thread Implementation By Runnable interface") ;

        Runnable obj1 = new A() ;
        Runnable obj2 = new B() ;

        Thread t1 = new Thread(obj1) ;
        Thread t2 = new Thread(obj2) ;

        t1.start() ;
        t2.start() ;


    }
    
}
