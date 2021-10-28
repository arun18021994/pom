package interview;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		String i = obj.next(); // malayalam
		String string ="";
		int l = i.length();
		for(int s=l-1;s>=0;s--) {
			 string = string+i.charAt(s);
		}
		System.out.println(string);
		}
}