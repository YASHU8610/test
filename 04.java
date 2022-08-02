// Write a program to remove the duplicate values

import java.util.*;
import java.util.Scanner;

public class Triplet
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        int[] arr = new int[n];
        
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
         Arrays.sort(arr);
        
        
        
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i-1] == arr[i]){
                
            }else{
                list.add(arr[i-1]);
            }
        }
        System.out.print(list);
    }
}

