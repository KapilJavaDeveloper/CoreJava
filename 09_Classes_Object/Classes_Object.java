// package 09_Classes_Object;

class Calculator{
    public int add(int n1 , int n2){
        return n1+n2 ;
    }
}
public class Classes_Object {
    public static void main(String [] args){
        int num1 = 12 ;
        int num2 = 2;

        Calculator obj = new Calculator() ;
        System.out.println(obj.add(num1 , num2) );

    }
    
}
