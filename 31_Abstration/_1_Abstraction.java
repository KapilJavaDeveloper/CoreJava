abstract class Car{
    abstract void drive();
    abstract void fly() ;
}

abstract class Car1 extends Car{
    void drive(){
        System.out.println("Driving a Car") ;

    }
}

class Car2 extends Car1{
    void fly(){
        System.out.println("Flying Car") ;
    }
}

public class _1_Abstraction{
    public static void main(String [] args){

        Car obj = new Car2() ;
        obj.drive() ;
        obj.fly() ;

    }
}