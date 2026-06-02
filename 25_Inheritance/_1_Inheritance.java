// package 25_Inheritance;

class Animal{
    String place = "Zoo" ;
}

class Lion extends Animal{
    void display(){
        System.out.println("Lion Animal") ;
    }
}
public class _1_Inheritance {
    public static void main(String [] args){
        System.out.println("Inheritance in java") ;

        Lion obj = new Lion() ;
        
        System.out.println("Animal Live in "+obj.place) ;
        obj.display() ;
    }
    
}
