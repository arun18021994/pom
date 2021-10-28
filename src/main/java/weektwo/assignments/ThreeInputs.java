package weektwo.assignments;

import java.util.Scanner;

public class ThreeInputs {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the first num:");
		int n = obj.nextInt();
		
		System.out.println("Enter the second num:");
		int n1 = obj.nextInt();
		
		System.out.println("Enter the third value in string:");
		String st = obj.next();
		int a;
	
		if(st.equals("subtraction")) {a=n-n1;
		System.out.println("subtraction for the given two integers is "+a);
		
		if(a<0)System.out.println("the value you getting is negative '-' ");}
		
		else if(st.equals("addition")) {a=n+n1;
		System.out.println("Addition for the given two integers is "+a);}
		
		else {System.out.println("please use the correct arithmetic operation");}
		
		
		
		
		
		
		
	}

}
