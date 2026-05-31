// package 20_Encapsulation;

class Bank{
    private int balance ;

    public void setBalance(int amount){
        if(amount>0){
            balance = balance + amount ;
        }

    }

    public int getBalance(){
        return this.balance ;
    }
}

public class _1_Encapsulation {
    public static void main(String [] args){
        System.out.println("Encapsulation Program") ;

        Bank obj = new Bank() ;

        obj.setBalance(100) ;

        System.out.println("Balance be: " + obj.getBalance()) ;

    }
    
}
