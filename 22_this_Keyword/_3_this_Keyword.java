// package 22_this_Keyword;


class Calculator{

    int value ;

    Calculator add(int value){
        this.value = this.value + value ;

        return this ;
    }

    Calculator multiply(int value){
        this.value = this.value * value ;
        return this ;
    }

    int getValue(){
        return this.value ;
    }

}
public class _3_this_Keyword {
    public static void main(String [] args){
        System.out.println("this keyword in java") ;

        Calculator obj = new Calculator() ;
        int result = obj.add(7).multiply(2).getValue() ;

        System.out.println("Result be: "  + result) ;


    }
    
}
