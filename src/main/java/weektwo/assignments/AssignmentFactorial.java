package weektwo.assignments;

import java.util.Scanner;

public class AssignmentFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the num:");
		
		int num= value.nextInt();
		
		int temp=1;
		
		for(int a=1;a<=num;a++) {
		temp=temp*a;
		}

		System.out.println("The factorial number is " + temp);
		
	}

}
