// Write a program to find the smallest number which is divisible by 1 to 9.

import java.util.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int n = 1;
		while(true){
		    if( n%8==0 && n%6==0 && n%5==0 && n%7==0 && n%9==0){
		       System.out.print(n);
		       break;
		    }
		    n++;
		}
		
	}
}
