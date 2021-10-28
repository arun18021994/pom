package weektwo.assignments;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int r = 0;
		for(int i=2;i<n;i++) { r = n%i;
		if(r==0) {break;}
		}
		if(r==0) {System.out.println("is not a prime number"); 
		  
		
		
		}else {System.out.println("is a prime number");
		}
		
		
	
	
	
	}}