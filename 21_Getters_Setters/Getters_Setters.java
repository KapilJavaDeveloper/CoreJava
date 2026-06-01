class Bank{
    private int amount ;

    // setters
    public void setAmount(int amount){
        if(amount>0){
            this.amount += amount ;
        }
    }

    // getters
    public int getAmount(){
        return this.amount ;
    }
}
public class Getters_Setters{
    public static void main(String [] args){
        System.out.println("Getters and Setters") ;

        Bank obj = new Bank() ;

        obj.setAmount(2000) ;

        System.out.println(obj.getAmount()) ;
    }
}