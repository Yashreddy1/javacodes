/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;
import java.util.*;
/**
 *
 * @author YASH REDDY
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check wehter its prime or not:");
        int a=sc.nextInt();
        boolean prime = true;
        
        for (int i=2;i<a;i++){
        if(a%i==0){
            System.out.println(a+" is not prime");
            break;
        }
        else{
            System.out.println(a+" is prime");
            break;
        }
    }

    
    }
}

