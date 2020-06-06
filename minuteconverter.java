package minute;
import java.util.*;
/**
 *
 * @author YASH REDDY
 */
public class Minute {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextLong();
        long b;
        b=(long) (a/(60*24*365));
        long c;
        c=(long)(((a/(60*24*365))-b)*365);
        System.out.println(b+" years "+c+" days");
        }
    
}
