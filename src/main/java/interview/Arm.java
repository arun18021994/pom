package interview;

import java.util.Scanner;

public class Arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//153 is armstring number or not
		Scanner obj = new Scanner(System.in);
		String n=obj.next();
		Integer j =Integer.parseInt(n);
		int i=0;
		int a=0;
		int l = n.length();
		System.out.println(l);
		while(j>0){
			
			i = j % 10;
			//System.out.println(i);
			 a = (int) (a+Math.pow(i, l));
			// System.out.println(a);
			j = j/10;
			
		}
		System.out.println(a);

	}

}
