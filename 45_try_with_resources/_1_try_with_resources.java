// package 45_try_with_resources;

import java.util.Scanner ;
public class _1_try_with_resources {
    public static void main(String [] args){
        System.out.println("try with resources Progream ---> ") ;

        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Please Enter Your name: ") ;
            String name = sc.nextLine() ;
            System.out.println("Your name be: " + name) ;

        }
    }
    
}
