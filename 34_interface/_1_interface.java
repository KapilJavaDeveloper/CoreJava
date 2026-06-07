interface Shape{
    int radius = 78 ;
    void draw() ;
}

class Circle implements Shape{

    @Override
    public void draw(){
        System.out.println("Circle is drawn of radius "+ radius) ;

    }
    String name= "Isskander " ;

}
public class _1_interface {
    public static void main(String [] args){

        Shape obj = new Circle() ;
        obj.draw() ;
        System.out.println(obj.radius) ;
     
    }
    
}
