package weektwo.assignments;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

@SuppressWarnings("unused")
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the word");
		String input = obj.next();
		String r="";
		int L=input.length();
		for(int i=L-1;i>=0;i--){
			r=r+input.charAt(i);
			}
		if(r.toLowerCase().equals(input.toLowerCase())) 
		{System.out.println(input+" is palidrome string");}
		else {System.out.println(input+ " is not a palindrone string");}
	}
	   
	 
	}

