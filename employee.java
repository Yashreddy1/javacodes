import java.util.*;
/**
 *
 * @author YASH REDDY
 */
public class Employee{ 
    
    String employ_list[][];
    
    
    
   
   
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no. of entries u want to make");
    int n=sc.nextInt();
    Employee emp= new Employee();
    emp.employ_list=new String[n+1][3];
    emp.employ_list[0][0]="NAME";
    emp.employ_list[0][1]="YEAR";
    emp.employ_list[0][2]="ADDRESS";
    for(int i=1;i<n+1;i++){
        for(int j=0;j<3;j++){
            
            if(j==0){
             System.out.println("name of employee no.: "+i);
            }
            if(j==1){
                 System.out.println("year of joining of employee no.: "+i);
            }
            if(j==2){
             System.out.println("adress of employee no.: "+i);
            }
             
        emp.employ_list[i][j]=sc.next();
        
                
        
    }  
    }
      for(int i=0;i<n+1;i++){
        for(int j=0;j<3;j++){
        System.out.print(emp.employ_list[i][j]+"      ");            
    }  
        System.out.println("");
    }
    }
    }
