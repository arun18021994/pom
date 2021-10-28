package interview;


import java.util.ArrayList;
import java.util.Scanner;

public class Programs {

	public static void main(String[] args) {

		// to find the number is prime number or not...
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of j:");
		int j =scanner.nextInt();
		int i;

		System.out.println("Enter the value of k:");
		ArrayList<Integer> notprime = new ArrayList<Integer>();
		ArrayList<Integer> prime = new ArrayList<Integer>();
		
		int k = scanner.nextInt();
		int a = 0;
		for (i = j; i <= k; i++) {
			
		for(int n=2;n<i;n++) {
				a = i % n;
			
				if (a == 0) {
                 notprime.add(i);
					//System.out.println("The given number is not prime numer " + i);
					break;
				}
			}
		    	if (a != 0) {
                 prime.add(i);
				//System.out.println("The given number is a prime number " + i);
			}
		}
		System.out.print("these are the prime numbers : " +prime);
		System.out.println("   ");
		System.out.print("these are not a prime numbers : " +notprime);
	}

}
