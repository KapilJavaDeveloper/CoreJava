// package 44_BudderedReader;
import java.io.BufferedReader;
import java.io.InputStreamReader ;
import java.io.IOException ;
public class _1_BufferedReader {
    public static void main(String [] args) throws IOException{
        System.out.println("BufferedReader Program") ;

        System.out.println("Enter Your name") ;

        InputStreamReader in = new InputStreamReader(System.in) ;
        BufferedReader bf = new BufferedReader(in) ;

        String name = bf.readLine() ;
        System.out.println("Your name be: "+ name) ;

    }
    
}
