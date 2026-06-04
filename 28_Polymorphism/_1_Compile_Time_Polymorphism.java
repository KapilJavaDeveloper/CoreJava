public class _1_Compile_Time_Polymorphism{
    int add(int a , int b){
        return a+b ;
    }
    int add(int a , int b , int c){
        return a+b+c ;
    }
    public static void main(String [] args){

        _1_Compile_Time_Polymorphism obj = new _1_Compile_Time_Polymorphism() ;

        System.out.println(obj.add(1,2)) ;
        System.out.println(obj.add(1,2,3)) ;
        
    }
}