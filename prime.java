package prime;
import java.util.*;

public class Prime {

    public static void main(String[] args) {
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check wehter its prime or not:");
        int a=sc.nextInt();
        
        for (int i=2;i<a;i++){
        if(a%i==0){
            System.out.println(a+" is not prime");
            flag=true;
            break;
        }
        
             
        }
        if(flag==false)
            System.out.println(a+" is prime");
        
        }
    }
