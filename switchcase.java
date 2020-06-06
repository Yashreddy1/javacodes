package switchcase;
import java.util.*;
/**
 *
 * @author YASH REDDY
 */
public class Switchcase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s;
        s='y';
        while(s=='y'){
        int a;
        System.out.println("choose any number from 1-4");
        a= sc.nextInt();
        switch(a){
            case 1:{
                System.out.println("u have choosen the first case");
                System.out.println("good work");
                break;
            }
            case 2:{
                System.out.println("u have choosen second case");
                System.out.println("good work");
                break;
            }
            case 3:{
                System.out.println("u have choosen third case");
                System.out.println("good work");
                break;
            }
            case 4:{
                System.out.println("u have choosen fouth case");
                System.out.println("good work");
                break;
            }
            default:{
                System.out.println("error!! choosen number not in range ");
                System.out.println("bad work");
                break;
            }
            
       
        }
        System.out.println("would you like to try again y/n: ");
        s=sc.next().charAt(0);
        
     
        
        }
    }
}
