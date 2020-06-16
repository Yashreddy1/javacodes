package matrix;
import java.util.*;

/**
 *
 * @author YASH REDDY
 */
public class Matrix {
    
    
    public static void main(String[] args) {
        int arr2[][]=new int[3][3];
    int arr[][]=  {{1,3,4},{2,4,3},{3,4,5}};
    int arr1[][]=  {{1,3,4},{2,4,3},{3,4,5}};
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    arr2[i][j]=arr[i][j]+arr1[i][j];
    }
    }
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    System.out.print(arr2[i][j]+" ");
    }
    System.out.println(" ");
    
    }
    System.out.println("addition done");
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        arr2[i][j]=0;
    for(int k=0;k<3;k++){    
    arr2[i][j]+=arr[i][k]*arr1[k][j];
    }
    }
    }
      for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    System.out.print(arr2[i][j]+" ");
    }
    System.out.println(" ");
    
    }
      System.out.println("multiplication done");
    
    }
    
    
}
