// package 16_StringBuffer_StringBuilder;

public class StringBuffer_StringBuilder {
    public static void main(String [] args){
        System.out.println("StringBuffer") ;

        StringBuffer sb = new StringBuffer("Isskander") ;
        sb.append(" isskander") ;

        System.out.println(sb) ;

        String str = sb.toString() ;

        StringBuilder s = new StringBuilder("Isskander") ;
        s.append(" isskander") ;

        System.out.println(s) ;

        String str1 = s.toString() ;
    }
    
}
