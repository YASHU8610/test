// Rotate the array in 90 degree.


import java.util.*;
import java.util.Scanner;

public class Main
{
    
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        
        
        
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr[0].length ; j++){
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }
        
        
       
           
      for(int i = 0 ; i < arr[0].length ; i++) {
           int low = 0;
           int high = arr[i].length-1;
           while(low < high){
           int temp = arr[i][low];
           arr[i][low] = arr[i][high];
           arr[i][high] = temp;
           low++;
           high--;
           } 
       }
       
       
       
       
       for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j]);
            }
        }
       
        
	}
}

