/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;
import java.util.*;
/**
 *
 * @author YASH REDDY
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lst=new ArrayList();
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        lst.add(a);
        lst.add(b);
        System.out.println("enter the number of numbers you want in fibonacci series");
        
        int n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for (int i=0;i<n-2;i++){
            int c=a+b;
            lst.add(c);
            a=b;
            b=c;
            System.out.println(c);
            
                    
            
        
        }
        System.out.println(lst);
        
        
        // TODO code application logic here
    }
    
}
