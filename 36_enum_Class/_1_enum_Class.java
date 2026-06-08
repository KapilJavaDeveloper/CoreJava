
enum Laptop{
    MacBook(2000) ,
    HP(1000) ,
    Dell ,
    Lenova(500) ;

    private int price ;

    public void setPrice(int price){
        this.price = price ;
    }
    public int getPrice(){
        return this.price ;
    }

    private Laptop(){
        this.setPrice(800) ;
        
    }
    private Laptop(int price){
        this.setPrice(price) ;
    }




}
public class _1_enum_Class{
    public static void main(String [] args){
        System.out.println("enum class ") ;

        Laptop lap = Laptop.MacBook ;
        Laptop lap1 = Laptop.HP ;
        Laptop lap2 = Laptop.Dell ;
        Laptop lap3 = Laptop.Lenova ;


        for(Laptop l : Laptop.values()){

            System.out.println(l + " : " + l.getPrice()) ;

            

        }

    }
}